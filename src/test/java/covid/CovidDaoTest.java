package covid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

class CovidDaoTest {
    MariaDbDataSource dataSource;
    CovidDao cd;

    @BeforeEach
    void setUp() {
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
        } catch (SQLException e) {
            throw new IllegalStateException("sql database error", e);
        }
    }

    @Test
    void saveCitizen() {
        Citizen c = new Citizen("Jani","1185",50,"jani@uh.hu","123456788");
        cd = new CovidDao(dataSource);
        cd.saveCitizen(c);
    }
}