package covid;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class CovidMain {

    public void runMenu(Covid c, CovidDao cd) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        Map<String,String> postMap = cd.mapPostcodes();

        while (!(menu == 7)) {
            System.out.println("" +
                    "1. Regisztráció\n" +
                    "2. Tömeges regisztráció\n" +
                    "3. Generálás\n" +
                    "4. Oltás\n" +
                    "5. Oltás meghiúsulás\n" +
                    "6. Riport\n" +
                    "7. Kilépés\n" +
                    "Menupont:");

            menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    cd.saveCitizen(register(postMap));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:

            }
        }
    }
    public Citizen register(Map<String, String> postMap){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teljes név:");
        String name = scanner.nextLine();
        System.out.println("Irányítószám:");
        String post = scanner.nextLine();
        System.out.println(postMap.get(post));
        System.out.println("Életkor:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("E-mail cím:");
        String email = scanner.nextLine();
        System.out.println("TAJ száma:");
        String taj = scanner.nextLine();

        Citizen c = null;
        try {
            c = new Citizen(name, post, age, email, taj);
        }catch (IllegalArgumentException e){
            System.out.println("hibás adatok: " + e);
        }
        return c;
    }


    public static void main(String[] args) {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");

        } catch (SQLException e) {
            throw new IllegalStateException("sql database error", e);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        CovidMain cm = new CovidMain();
        Covid covid = new Covid();
        CovidDao covidDao = new CovidDao(dataSource);
        cm.runMenu(covid,covidDao);
    }
}
