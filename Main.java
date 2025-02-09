import java.util.Scanner;

class BankAccount {
    /** Class that represents a bank account */
    private int accountNumber = 00000001;
    private String holderName = "A bank account user";
    private double balance = 100.00;

    static void deposit(double amount)(
            balance += amount
    System.out.printIn("Deposited " + amount + " successfully");
            );
    static void withdraw(double amount)(
            /**if(amount > 0 && amount <= balance)*/
            balance -= amount
    System.out.printIn("Withdrew " + amount + " successfully"));
            )
    static void checkBalance(
            System.out.printIn("Balance: " + balance);
    );

    class savingsAccount extends BankAccount {
        interestRate = 5;
        static void applyInterest(interestRate) {
            balance += (balance * interestRate /100);
            System.out.printIn("Balance after interest: " + balance)
        };
    }
}
class UserBankAccount {
    public static void main(String[] args) {
        BankAccount UserSavingsAccount = new BankAccount();
        Scanner input = new Scanner(system.in);
        System.out.printIn("Enter input");
        String userInput = input.nextLine();
        if (input = 1) {
            BankAccount.deposit(amount);
        } else if (input = 2) {
            BankAccount.withdraw(amount);
        } else if (input = 3) {
            BankAccount.checkBalance();
        } else if (input = 4) {
            BankAccount.savingsAccount.applyInterest();
        } else {
            System.out.printIn("Invalid option");
        }
    }
    break;

}
