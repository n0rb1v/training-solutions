package week03;

import java.util.Scanner;

public class PhoneParse {
    public Phone parse(String s){
        String prefix = s.substring(0,2);
        String number = s.substring(3);
        Phone phone = new Phone(prefix,number);
        return phone;

    }

    public static void main(String[] args) {
        String s = "70-7654321";
        PhoneParse parser = new PhoneParse();
        Phone phone = parser.parse(s);
        System.out.println(phone);

    }
}
