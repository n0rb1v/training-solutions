package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

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
    void saveActivity() {
        ad = new ActivityDao(dataSource);
    }
}