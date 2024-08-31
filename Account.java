package polymorphism;

public class Account 
{
    int accountNumber;
    String accountHolder;
    double balance;

    Account(int accountNumber, String accountHolder, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) 
    {
        if (amount >= 0) 
        {
            balance = balance + amount;
            System.out.println("Deposit successful: " + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit:");
        }
    }

    void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + balance);
        } 
        else 
        {
            System.out.println("Withdrawal unsuccessful:");
        }
    }

    void displayAccountInfo() 
    {
        System.out.println("The AccountNumber is: " + accountNumber);
        System.out.println("The AccountHolder is: " + accountHolder);
        System.out.println("The Balance is: " + balance);
    }

    public void withdraw(double amount, String transactionType) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " for " + transactionType + " successful. New balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class SavingAccount extends Account 
{
   
    SavingAccount(int accountNumber, String accountHolder, double balance) 
    {
        super(accountNumber, accountHolder, balance);

        @Override

        void withdraw(double amount) 
        {
         if (amount > 0 && amount <= balance) 
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + balance);
        } 
        else 
        {
            System.out.println("Withdrawal unsuccessful:");
        }
        }
    }
}

public class Main 
{
    public static void main(String[] args) 
    {

        Account myAccount = new Account(123456, "John Doe", 1000.0);
        myAccount.displayAccountInfo();

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.displayAccountInfo();

        myAccount.withdraw(150.0, "Groceries");
        myAccount.displayAccountInfo();

        // Creating a SavingAccount
        SavingAccount mySavingAccount = new SavingAccount(789012, "Jane Smith", 2000.0);
        mySavingAccount.displayAccountInfo();
    }
}
