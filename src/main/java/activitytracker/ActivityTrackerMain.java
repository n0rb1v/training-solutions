package activitytracker;


import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {
    private List<Activity> actList = new ArrayList<>();

    public static void main(String[] args) {
        Activity act1 = new Activity(1, LocalDateTime.of(2012,5,22,17,55),
                "probablbla",ActivityType.BIKING);
        Activity act2 = new Activity(2, LocalDateTime.of(2015,9,21,19,50),
                "probabfdlbla",ActivityType.HIKING);
        Activity act3 = new Activity(3, LocalDateTime.of(2017,6,17,14,45),
                "probabaaalbla",ActivityType.BASKETBALL);
        ActivityTrackerMain act = new ActivityTrackerMain();

        try {
            MariaDbDataSource dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
            act.sqlSelectId(6,dataSource);

        } catch (SQLException e) {
            throw new IllegalStateException("sql hiba", e);
        }


    }
    private void sqlSelectId(int i, MariaDbDataSource ds) throws SQLException {
        try (Connection conn = ds.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from activitytracker where id =?",
                             Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, i);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                Timestamp ts = rs.getTimestamp(2);
                LocalDateTime time = ts.toLocalDateTime();
                String desc = rs.getString(3);
                ActivityType type = ActivityType.valueOf(rs.getString(4).toUpperCase());
                Activity a = new Activity(id,time,desc,type);
                System.out.println(a);
            }

            }


    }
    private void sqlInsert(Activity o, MariaDbDataSource ds) throws SQLException {
        try (Connection conn = ds.getConnection();
             PreparedStatement stmt =
                 conn.prepareStatement("insert into activitytracker(start_time,activity_desc,activity_type) values (?,?,?)",
                     Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(o.getStartTime()));
            stmt.setString(2, o.getDesc());
            stmt.setString(3, o.getType().toString());

            stmt.executeUpdate();
        }
    }
}
