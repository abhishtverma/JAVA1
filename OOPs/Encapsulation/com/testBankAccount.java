package OOPs.Encapsulation.com;

public class testBankAccount {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount("5aq29", "abhi");
        customer.deposit(1000);
        System.out.println(customer.withdraw(100));
        System.out.println(customer.withdraw(900));
    }
}
