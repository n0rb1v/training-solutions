package classstructureintegrate;

public class BankAccouuntMain {
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount("0001","jozsi",50000);
        BankAccount bankAccount2=new BankAccount("0002","laci",30000);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());
        bankAccount2.deposit(15000);
        bankAccount1.withdraw(3000);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        bankAccount1.transfer(bankAccount2,10000);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());


    }
}
