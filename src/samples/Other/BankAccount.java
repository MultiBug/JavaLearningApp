package samples.Other;
import samples.*;

public class BankAccount {
    private double balance = 0;
    public void deposit(double x) {
        if(x > 0) {
            balance += x;
        }
    }
}