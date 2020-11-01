package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Kérek 2 számot:");
        int a = scr.nextInt();
        int b = scr.nextInt();
        System.out.println(a+"+"+b);
        System.out.println(a+b);

    }
}
