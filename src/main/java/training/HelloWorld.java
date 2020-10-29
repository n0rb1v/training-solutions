package training;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scr = new Scanner(System.in);
        String nam = scr.nextLine();
        System.out.println("Hello "+nam);

    }
}
