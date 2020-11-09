package literals;

public class LiteralsMain {

    public static void main(String[] args) {
        String s1 = ""+1+2;
        double quotient = 3.0/4;
        long big = 3_244_444_444L;
        String s2 = "árvíztűrőtükörfúrógép";
        String word = "title".toUpperCase();

        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

    }
}
