package training;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scr = new Scanner(System.in);
        String nam = scr.nextLine();
        System.out.println("Hello "+nam);

        System.out.println("What's your year of birth?");
        int year = scr.nextInt();
        System.out.println("Year of birth: " + year); // 2

        System.out.println(2020 - year); // 3
    }
}
