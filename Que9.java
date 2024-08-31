// Accept two numbers and find sum of two even or odd numbers

import java.util.Scanner;

public class Que9

{
    int iNo1 = 0;
    int iNo2 = 0;
    int iSum = 0;
   

    public void AddOddorEven()
    {
       
        if((iNo1 % 2 == 0) && (iNo2 % 2 == 0))
        {
              iSum = iNo1 + iNo2;

            System.out.println("The Addition of even numbers is: \n" +iSum);
        } 
        
        else if ((iNo1 % 2 != 0) && (iNo2 % 2 != 0))
        {
                iSum = iNo1 + iNo2;
            System.out.println("The Addition of odd numbers is: \n" +iSum);
        }
        else 
        {      
              iSum = iNo1 + iNo2;
            System.out.println("The addition of even or odd numbers is: \n"+iSum);
        }

    }

    public static void main(String args[])
    {
       Scanner sobj = new Scanner(System.in);
       Que9 obj = new Que9();
       
       
        {
          System.out.println("Enter the first number:");
        }
          obj.iNo1 = sobj.nextInt();

         
        {
           System.out.println("Enter the second number:");
        }
           
           obj.iNo2 = sobj.nextInt();
    

       obj.AddOddorEven();

    }
}