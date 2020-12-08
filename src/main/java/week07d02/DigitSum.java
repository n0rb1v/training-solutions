package week07d02;

public class DigitSum {
    public static int sumOfDigits(int x){
        if (x<0){
            throw new IllegalArgumentException("negativ szam");
        }
        String number = ""+x;
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.substring(i,i+1));

        }
        return sum;
    }
}
