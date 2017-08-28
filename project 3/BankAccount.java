import java.util.*;

public class BankAccount {
    Random rand = new Random();
    
    private String name;
    private double balance = 0;
    private int accountNumber;
    private static double interestRate = 0.3;
    static int count = 0;
    
    public BankAccount(String name) {
        this.name = name;
        this.accountNumber = 100000 + rand.nextInt(899999);
        count++;
    }
    
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = 100000 + rand.nextInt(899999);
        count++;
    }
    
    public double deposit(double money) {
        if (money > 0) {
            this.balance += money;
            return money;
        }
        else
            return -1;
    }
    
    public double withdrawMoney(double money) {
        if ((this.balance - money) < 0 || money < 0) {
            return -1;
        }     
        else {
            this.balance -= money;
            return money;   
        }
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public static double getInterestRate() {
        int times = count / 5;
        if (count % 5 == 0) {
            interestRate -= times * 0.02;
            count = 0;
        }   
        return interestRate;
    }
    
    public double transfer(BankAccount destinationBankAccount, double amount) {
        if ((this.balance - amount) < 0 || destinationBankAccount == null || amount < 0)
            return -1;
        else {
            withdrawMoney(amount);
            destinationBankAccount.deposit(amount);
            return amount;
        }
        
    }
    
    public double transfer(BankAccount[] destinationBankAccount, double amount) {
        if (destinationBankAccount == null
                || amount < 0 
                || destinationBankAccount.length == 0
                || (this.balance - amount * destinationBankAccount.length) < 0) {            
            return -1;
        }               
        else {
            for (int i = 0; i < destinationBankAccount.length; i++) {
                destinationBankAccount[i].deposit(amount);                
            }        
        }
        return amount * destinationBankAccount.length;
    }  
    
    public static void main(String[] args) {
        
        BankAccount bankAccountOne = new BankAccount("Bob", 1000);
        BankAccount bankAccountTwo = new BankAccount("Sara");
        double transfer = bankAccountOne.transfer(bankAccountTwo, 500);         
    }
}