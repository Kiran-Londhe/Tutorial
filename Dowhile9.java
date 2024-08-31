// WAP to print sum of odd and even no.

package loop;

import java.util.Scanner;

public class Dowhile9 
{
  
     public static void main(String[] args) 
     {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the range upto:");
      int range = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        int iNo = 1;   

         
          do
          {
           if(iNo % 2 == 0 )

           {
            evenSum = evenSum + iNo;
           }

           else
           {
             oddSum = oddSum + iNo;
           }

           iNo++;
           
          } 
          while(iNo <= range);
          
          System.out.print("sum of even numbers is:"+ evenSum);
          System.out.print(" and sum of odd numbers is:"+ oddSum);

    }
    
}