package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {
                "hetfo", "kedd", "szerda", "csutrotok", "pentek", "szombat", "vasarnap"
        };
        System.out.println(days[1] + ":" + days.length);

        int[] hatvany = new int[5];
        for (int i = 0; i < hatvany.length; i++) {
            hatvany[i] = (int) Math.pow(2, i);
            System.out.println(hatvany[i]);
        }
        boolean[] tomb = new boolean[6];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = ((i % 2) == 0) ? false : true;
            System.out.println(tomb[i]);
        }
    }
}