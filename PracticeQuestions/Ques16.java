// Q16. Bank Account
// Create a BankAccount class having:
// accountNumber
// accountHolderName
// balance
// Methods:
// deposit()
// withdraw()
// checkBalance()
// Do not allow withdrawal if balance is insufficient.



class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Ques16 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, "Harman", 5000);

        account.checkBalance();

        account.deposit(2000);
        account.checkBalance();

        account.withdraw(3000);
        account.checkBalance();

        account.withdraw(10000);
    }
}