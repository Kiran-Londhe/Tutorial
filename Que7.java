// Accept two numbers and find sum of two even numbers

import java.util.Scanner;

public class Que7

{
    int iNo1 = 0;
    int iNo2 = 0;
    int iSum = 0;
   
    {
        System.out.println( iNo1);
        System.out.println( iNo2);
        System.out.println( iSum);

    }
   

    public void AddEven()
    {
       
        if((iNo1 % 2 == 0) && (iNo2 % 2 == 0))
        {
            iSum = iNo1 + iNo2;

            System.out.println("The Addition of even numbers is:"+iSum);
        }
        
        else if ((iNo1 % 2 != 0) && (iNo2 % 2 != 0))
        {
            System.out.println("Both numbers are odd:");
        }
        else
        {
            System.out.println("There is only one Even number present:");
        }

    }

    public static void main(String args[])
    {
       Scanner sobj = new Scanner(System.in);
       Que7 obj = new Que7();
       
       
        {
          System.out.println("Enter the first number:");
        }
          obj.iNo1 = sobj.nextInt();

         
        {
           System.out.println("Enter the second number:");
        }
           
           obj.iNo2 = sobj.nextInt();
    

       obj.AddEven();

    }
}