package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity a) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("insert into activitytracker(start_time,activity_desc,activity_type) values (?,?,?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(a.getStartTime()));
            stmt.setString(2, a.getDesc());
            stmt.setString(3, a.getType().toString());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException("insert error", e);
        }
    }

    public Activity findActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from activitytracker where id =?")) {
            stmt.setLong(1, id);
            List<Activity> x = getStatement(stmt);
            if (x.size() == 1) {
                return x.get(0);
            }
            throw new IllegalStateException("not found");
        } catch (SQLException e) {
            throw new IllegalStateException("select error", e);
        }
    }

    public List<Activity> findActivityByType(ActivityType type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from activitytracker where activity_type=?")) {
            stmt.setString(1, type.toString());
            List<Activity> x = getStatement(stmt);
            return x;
        } catch (SQLException e) {
            throw new IllegalStateException("select error", e);
        }
    }

    public List<Activity> listActivities() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from activitytracker")) {
            return getStatement(stmt);
        } catch (SQLException e) {
            throw new IllegalStateException("select* error");
        }
    }

    private List<Activity> getStatement(PreparedStatement stmt) throws SQLException {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity a = new Activity(
                        rs.getLong(1),
                        rs.getTimestamp(2).toLocalDateTime(),
                        rs.getString(3),
                        ActivityType.valueOf(rs.getString(4).toUpperCase()));
                result.add(a);
            }
        }
        return result;
    }
}
