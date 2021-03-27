package operators;

public class Operators {
    public boolean isEven(int n) {
        if (n % 2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    public int multiplyByPowerOfTwo(int i, int n) {
        return i << n;
    }
}
