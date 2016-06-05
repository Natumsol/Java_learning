package account;

/**
 * Created by natumsol on 16/6/3.
 */
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account() {
        this("empty", 0.0);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double money) {
        balance += money;
    }

    public double withdraw(double money) {
        if (balance - money >= 0) {
            balance -= money;
            return money;
        } else {
            balance = 0;
            return 0;
        }
    }

    protected void finalize(){
        System.out.println(accountNumber + "被GC回收!");
    }

}
