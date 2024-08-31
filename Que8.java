// Accept two numbers and find sum of two odd numbers

import java.util.Scanner;

public class Que8

{
    int iNo1 = 0;
    int iNo2 = 0;
    int iSum = 0;
   

    public void AddOdd()
    {
       
        if((iNo1 % 2 != 0) && (iNo2 % 2 != 0))
        {
            iSum = iNo1 + iNo2;

            System.out.println("The Addition of odd numbers is: \n" +iSum);
        } 
        
        else if ((iNo1 % 2 == 0) && (iNo2 % 2 == 0))
        {
            System.out.println("Both numbers are even:");
        }
        else
        {
            System.out.println("There is only one Odd number present:");
        }

    }

    public static void main(String args[])
    {
       Scanner sobj = new Scanner(System.in);
       Que8 obj = new Que8();
       
       
        {
          System.out.println("Enter the first number:");
        }
          obj.iNo1 = sobj.nextInt();

         
        {
           System.out.println("Enter the second number:");
        }
           
           obj.iNo2 = sobj.nextInt();
    

       obj.AddOdd();

    }
}