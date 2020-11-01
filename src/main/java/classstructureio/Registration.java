package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Kérem a nevet:");
        String name = scr.nextLine();
        System.out.println("Kérem az email cimet:");
        String emil = scr.nextLine();
        System.out.println(name+" => "+emil);

    }
}
