// Q20. ATM Withdrawal (Custom Exception)
// Create a custom exception named:
// InsufficientBalanceException
// Create an ATM class that:
// Maintains account balance.
// Allows withdrawal only if sufficient balance is available.
// Throws the custom exception when the balance is insufficient.



class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class ATM {
    double balance;

    ATM(double balance){
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance. Withdrawal failed.");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }
}

public class Ques20 {
    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        try {
            atm.withdraw(3000);
            atm.withdraw(4000);
        }

        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
