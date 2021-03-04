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
                        "insert into citizens(c_name,c_zip,c_age,c_email,c_taj) values (?,?,?,?,?)",
                        Statement.RETURN_GENERATED_KEYS)
        ) {
            stmt.setString(1, c.getName());
            stmt.setString(2, c.getPostcode());
            stmt.setInt(3, c.getAge());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getTAJnumber());
            stmt.executeUpdate();
            c.setId(getKey(stmt));
            return c;
        } catch (SQLException e) {
            throw new IllegalStateException("insert error", e);
        }
    }

    public void updateCitizen(Citizen c) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(
                        "UPDATE `citizens` SET `num_of_vacc`=?, `last_vacc`=? WHERE  `id`=?")
        ) {
            stmt.setInt(1, c.getVaccNumber());
            stmt.setString(2, c.getVaccLast().toString());
            stmt.setLong(3,c.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException("update error", e);
        }
    }

    public void saveCitizenList(List<Citizen> cl) {
        for (Citizen item : cl) {
            saveCitizen(item);
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


    public Citizen selectCitizen(String taj) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement(
                             "SELECT * FROM citizens WHERE c_taj = ?")) {
            stmt.setString(1, taj);
            List<Citizen> x = getStatementList(stmt);
            if (x.size() == 1) {
                return x.get(0);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new IllegalStateException("select* error");
        }
    }

    public List<Citizen> listGenerate(String post) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement(
                             "SELECT * FROM citizens WHERE c_zip = ? AND (num_of_vacc = 0 OR num_of_vacc = 1) ORDER BY c_age DESC LIMIT 16")) {
            stmt.setString(1, post);
            return getStatementList(stmt);
        } catch (SQLException e) {
            throw new IllegalStateException("select* error");
        }
    }

    private List<Citizen> getStatementList(PreparedStatement stmt) throws SQLException {
        List<Citizen> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Citizen a = new Citizen(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getTimestamp(8)
                );
                result.add(a);
            }
        }
        return result;
    }


    public Map<String, String> mapPostcodes() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from cities")) {
            return getMapStatement(stmt);
        } catch (SQLException e) {
            throw new IllegalStateException("select map post error");
        }
    }

    private Map<String, String> getMapStatement(PreparedStatement stmt) throws SQLException {
        Map<String, String> result = new HashMap<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                result.put(rs.getString(1), rs.getString(2));
            }
        }
        return result;
    }
}
