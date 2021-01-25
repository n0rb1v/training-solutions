package week02d05;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tipus?");
        String x=scanner.nextLine();
        System.out.println("mem meret");
        int i= scanner.nextInt();
        Phone phone1=new Phone(x,i);
        x=scanner.nextLine();


        System.out.println("tipus?");
        x=scanner.nextLine();
        System.out.println("mem meret");
        i= scanner.nextInt();
        Phone phone2=new Phone(x,i);

        System.out.println(phone1.getType()+" "+phone1.getMem());
        System.out.println(phone2.getType()+" "+phone2.getMem());


    }
}
