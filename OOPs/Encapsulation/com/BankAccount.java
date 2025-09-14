package OOPs.Encapsulation.com;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double money) {
        if (money < 0) {
            System.out.println("Invalid amount");
        } else {
            balance += money;
        }
    }

    public double withdraw(double money) {
        if (money > balance) {
            System.out.println("Invalid amount to be withdraw");
        } else if (money <= 0) {
            System.out.println("Invalid Input");
        } else {
            balance -= money;

        }
        return money;

    }
}
