package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Client kliens = new Client();
        System.out.println("Kérem az adatokat(név,lakcím,év):");
        kliens.name=scr.nextLine();
        kliens.address=scr.nextLine();
        kliens.year=scr.nextInt();

        System.out.println(kliens.name+" / "+kliens.year+" / "+ kliens.address);

    }
}
