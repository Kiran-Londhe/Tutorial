package pollymorphism;

public class Account
{
     int accountNumber;
     char accountHolder;
     double balance;

     Account(int accountNumber, char accountHolder, double balance)
     {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
     }

     void deposite(double amount)
     {
        if(amout > 0 )
        {
            balance += amount;
            System.out.println("deposite succesful:" +balance);
        }
        else
        {
           System.out.println("Invalid deposit:");
        }

     }
    
     void widraw(double amount)
     {
      if(amout >= 0 )

      balance -= amount;
      System.out.println("Widraw succesful:" +balance);
      {
         else
         {
            System.out.println("can not widraw:");
         }
      }

     }

     void displayAccountinfo()
     {
         System.out.println("AccountNumber: "+ accountNumber);
         System.out.println("AccountHolder: " + accountHolder);
         System.out.println("Balance:"+balance);
     }

     public static void main(String[] args) 
     {
      SavingAccount sav = new SavingAccount(12345, Kiran, 10000)
     }

     
    

}