public class BankAccount {
    
    double balance;
    
    public BankAccount (double n) {
        balance = n;
    }
    
    public BankAccount () {
        balance = 100;
    }
    
    public void withdraw (double n) {
        balance = balance - n;
    }
    
    public void deposit (double n) {
        balance = balance + n;
    }
    
    public String toString () {
        return "The balance is " + balance;
    }
    
    public double setBalance (double n) {
        balance = n;
        return balance;
    }
    
    public double getBalance () {
        return balance;
    }
}