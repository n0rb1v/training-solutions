package covid;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.nio.file.Path;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CovidMain {
    Scanner scanner = new Scanner(System.in);

    public void runMenu(Covid c, CovidDao cd) {
        int menu = 0;
        Map<String, String> postMap = cd.mapPostcodes();

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
                    c.addFromFile(filePath());
                    cd.saveCitizenList(c.getCitizens());
                    break;
                case 3:
                    System.out.println("Iranyito szam:");
                    String post = scanner.nextLine();
                    List<Citizen> generated = cd.listGenerate(post);
                    c.saveFile(filePath(), generated);
                    System.out.println(generated);
                    break;
                case 4:
                    System.out.println("TAJ szam:");
                    String taj = scanner.nextLine();
                    System.out.println("Datum:");
                    String datum = scanner.nextLine();
                    LocalDateTime lastdate = null;
                    if (datum.isEmpty()) {
                        lastdate = LocalDateTime.now();
                    } else {
                        lastdate = LocalDateTime.parse(datum);
                    }
                    System.out.println("Oltas tipus:");
                    String oltas = scanner.nextLine();
                    Citizen citizen = cd.selectCitizen(taj);
                    if (isValidTAJ(taj) & citizen != null) {
                        citizen.incVaccNumber();
                        citizen.setVaccLast(lastdate);
                        cd.updateCitizen(citizen);
                    } else {
                        System.out.println("hibas vagy nem regisztralt taj");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:

            }
        }
    }

    private Path filePath() {
        System.out.println("File:");
        String file = scanner.nextLine();
        return Path.of("src/main/resources/" + file);

    }

    private Citizen register(Map<String, String> postMap) {
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
        } catch (IllegalArgumentException e) {
            System.out.println("hibás adatok: " + e);
        }
        return c;
    }

    private boolean isValidTAJ(String s) {
        int sum = 0;
        for (int i = 0; i < 8; i += 2) {
            sum += (Integer.parseInt(String.valueOf(s.charAt(i))) * 3);
            sum += (Integer.parseInt(String.valueOf(s.charAt(i + 1))) * 7);
        }
        if (!(sum % 10 == Integer.parseInt(String.valueOf(s.charAt(8))))) {
            return false;
        }
        return true;
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
        cm.runMenu(covid, covidDao);
    }
}
