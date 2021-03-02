package covid;

import activitytracker.Activity;
import activitytracker.ActivityType;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CovidDao {
    private DataSource dataSource;

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Citizen saveCitizen(Citizen c) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(
                        "insert into covid(c_name,c_post,c_age,c_email,c_taj) values (?,?,?,?,?)",
                        Statement.RETURN_GENERATED_KEYS)
        ) {
            stmt.setString(1, c.getName());
            stmt.setString(2, c.getPostcode());
            stmt.setInt(3,c.getAge());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getTAJnumber());
            stmt.executeUpdate();
            c.setId(getKey(stmt));
            return c;
        } catch (SQLException e) {
            throw new IllegalStateException("insert error", e);
        }
    }
    private long getKey(PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new IllegalStateException("id error");
        }
    }
    public Map<String,String> mapPostcodes() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from varosok")) {
            return getMapStatement(stmt);
        } catch (SQLException e) {
            throw new IllegalStateException("select map post error");
        }
    }
    private Map<String,String> getMapStatement(PreparedStatement stmt) throws SQLException {
        Map<String,String> result = new HashMap<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                result.put(rs.getString(1),rs.getString(2));
            }
        }
        return result;
    }
}
