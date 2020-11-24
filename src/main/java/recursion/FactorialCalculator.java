package recursion;

public class FactorialCalculator {

    public long getFactorial(int number) {
        if (number > 1) {
            long sol = getFactorial(number-1);
            return number * sol;
        }
        return 1;
    }
}
