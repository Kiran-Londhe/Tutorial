// Accept two numbers and find Largest number

import java.util.Scanner;

public class Que6

{
    int iNo1 = 0;
    int iNo2 = 0;
   

    public void FindLargestNum()
    {
       
        if(iNo1 > iNo2) 
        {
            System.out.println("The Largest Number is:"+iNo1);
        }
        
        else if (iNo2 > iNo1)
        {
            System.out.println("The Largest Number is:"+iNo2);
        }
        else
        {
            System.out.println("Both numbers are same:");
        }

    }

    public static void main(String args[])
    {
       Scanner sobj = new Scanner(System.in);
       Que6 obj = new Que6();
       
       
        {
          System.out.println("Enter the first number:");
        }
          obj.iNo1 = sobj.nextInt();

         
        {
           System.out.println("Enter the second number:");
        }
           
           obj.iNo2 = sobj.nextInt();
    

       obj.FindLargestNum();

    }
}