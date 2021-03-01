package covid;

import java.util.Scanner;

public class CovidMain {
    public void runMenu() {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);

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


    public static void main(String[] args) {
        CovidMain cm = new CovidMain();
        cm.runMenu();
    }
}
