package week07d01;

public class MathAlgorithms {
    public static boolean isPrime(int x) {
        if (x<1){
            throw new IllegalArgumentException("rossz parameter");
        }
        for (int i = 2; i < x; i++) {
            if ( x % (double)i == 0.0) {
                return false;
            }
        }
        return true;
    }
}
