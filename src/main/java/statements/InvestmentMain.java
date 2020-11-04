package statements;

public class InvestmentMain {
    public static void main(String[] args) {
        Investment investment1 = new Investment(100000,8);
        System.out.println(investment1.getYield(50));
        System.out.println(investment1.close(80));
        System.out.println(investment1.close(90));

    }
}
