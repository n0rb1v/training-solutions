package week08d05;

public class MathAlgorithms {
    public static int greatestCommonDivisor(int a, int b) {
        int oszto = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                oszto = i;
            }
        }
        return oszto;
    }
}
