package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Eloado:");
        song.band=scr.nextLine();
        System.out.println("Cim:");
        song.title=scr.nextLine();
        System.out.println("Hossz:");
        song.lenght=scr.nextInt();

        System.out.println(song.band+" - "+song.title+" ("+song.lenght+"perc)");

    }
}
