package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.*;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {
    ActivityDao ad;
    MariaDbDataSource dataSource;

    @BeforeEach
    void setUp() {
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException e) {
            throw new IllegalStateException("sql database error", e);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
    }

    @Test
    void saveActivityTest() {
        ad = new ActivityDao(dataSource);
        Activity act = new Activity(1, LocalDateTime.of(2012, 5, 22, 17, 55),
                "probablbla", ActivityType.BIKING);
        ad.saveActivity(act);

        assertEquals(4, ad.listActivities().size());
    }

    @Test
    void findActivityByIdTest() {
        ad = new ActivityDao(dataSource);
        assertEquals("bgadttyuif", ad.findActivityById(1).getDesc());
    }

    @Test
    void findActivityByTypeTest() {
        ad = new ActivityDao(dataSource);
        assertEquals(1, ad.findActivityByType(ActivityType.HIKING).size());
    }

    @Test
    void listActivitiesTest() {
        ad = new ActivityDao(dataSource);
        assertEquals(3, ad.listActivities().size());
    }

}