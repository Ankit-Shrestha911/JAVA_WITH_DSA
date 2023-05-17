public class Encapsulation {
    public static void main(String[] args) {

        BankAccount c1 = new BankAccount(123, 1000);
        System.out.println(c1.getBalance());
        c1.deposit(1000);
        System.out.println(c1.getBalance());
        c1.withdrawal(1000);
        c1.withdrawal(1000);
        System.out.println(c1.getBalance());


    }
}

class BankAccount {
    private int AccountNunber;
    private double balance;

    public BankAccount(int AccountNunber, double balance) {
        this.AccountNunber = AccountNunber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdrawal(int amount) {
        if (balance - amount >= 0)
            balance -= amount;
        else
            System.out.println("Not sufficient balance");
    }
}