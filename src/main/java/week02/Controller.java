package week02;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private Office office;

    public void readOffice() {
        office = new Office();
        Scanner scanner = new Scanner(System.in);
        String command = "";

        System.out.println("Targyalo: neve,szelessege,hossza (ures sor vege)");
        do {
            command = scanner.nextLine();
            if (!command.equals("")) {
                String[] arrOfString = command.split(",");
                MeetingRoom room = new MeetingRoom(arrOfString[0], Integer.parseInt(arrOfString[1]), Integer.parseInt(arrOfString[2]));
                office.addMeetingRoom(room);

            }
        }
        while (!command.equals(""));
    }

    public void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("| 1. Targyalok sorrendben       |");
        System.out.println("| 2. Targyalok visz. sorrendben |");
        System.out.println("| 3. Minden masodik targyalo    |");
        System.out.println("| 4. Teruletek                  |");
        System.out.println("| 5. Kereses nev alapjan        |");
        System.out.println("| 6. Kereses nevtoredek alapjan |");
        System.out.println("| 7. Kereses terulet alapjan    |");
        System.out.println("---------------------------------");
        System.out.println("Menupont:");

    }

    public void runMenu() {
        int menu = 0;
        int terulet = 0;
        String nev = "";

        Scanner scanner = new Scanner(System.in);
        menu = Integer.parseInt(scanner.nextLine());

        switch (menu) {
            case 1:
                office.printNames();
                break;
            case 2:
                office.printNames();
                break;
            case 3:
                office.printEvenNames();
                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                System.out.println("Nev:");
                nev = scanner.nextLine();
                office.printMeetingRoomsWithName(nev);
                break;
            case 6:
                System.out.println("Nevtoredek:");
                nev = scanner.nextLine();
                office.printMeetingRoomsContains(nev);
                break;
            case 7:
                System.out.println("Meret:");
                terulet = Integer.parseInt(scanner.nextLine());
                office.printAreasLargerThan(terulet);
                break;
        }

    }




    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.readOffice();
        controller.printMenu();
        controller.runMenu();

    }

}
