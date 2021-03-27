package introexception;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < 9; i++) {
            if (isOdd(i)) {
                sum1 += 3 * Integer.parseInt(String.valueOf(ssn.charAt(i - 1)));
            } else {
                sum2 += 7 * Integer.parseInt(String.valueOf(ssn.charAt(i - 1)));
            }
        }
        if ((sum1 + sum2) % 10 == Integer.parseInt(String.valueOf(ssn.charAt(8)))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isOdd(int i) {
        return i % 2 == 1;
    }
}
