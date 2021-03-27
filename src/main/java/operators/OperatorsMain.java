package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators o = new Operators();
        System.out.println(o.isEven(5));
        System.out.println(16 << 1);
        System.out.println(13 << 1);
        System.out.println(o.multiplyByPowerOfTwo(5, 2));

        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int j = Long.valueOf(s, 2).intValue();
        System.out.println(j);
    }

}
