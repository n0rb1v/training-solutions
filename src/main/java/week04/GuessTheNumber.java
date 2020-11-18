package week04;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        final Random rnd = new Random();

        int number = rnd.nextInt(99)+1;
        int guess = 0;
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i<6) {

            System.out.println("Szam?");
            guess = Integer.parseInt(scanner.nextLine());
            if (guess < number){
                System.out.println("kisebb");
            }
            if (guess > number){
                System.out.println("nagyobb");
            }
            if (guess == number){
                System.out.println("Kitalatad "+number );
            }
            i++;
        }
        if (i == 6){
            System.out.println("Elfogyott a lehetoseg");
    }
}
