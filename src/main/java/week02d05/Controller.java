package week02d05;

import java.util.Scanner;

public class Controller {
    private Office office;
    boolean exit=false;

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
        System.out.println(
        "-----------------------------------------------------------------\n"+
        "| 1. Targyalok sorrendben       | 5. Kereses nev alapjan        |\n"+
        "| 2. Targyalok visz. sorrendben | 6. Kereses nevtoredek alapjan |\n"+
        "| 3. Minden masodik targyalo    | 7. Kereses terulet alapjan    |\n"+
        "| 4. Teruletek                  | 8. Kilepes                    |\n"+
        "-----------------------------------------------------------------\n"+
        "Menupont:");
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
                office.printNamesReverse();
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
            case 8:
                exit=true;
        }

    }

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.readOffice();
        while (!controller.exit){
            controller.printMenu();
            controller.runMenu();

        }
    }

}
