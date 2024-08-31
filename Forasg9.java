// WAP to print sum of odd and even no.

package frloop;

import java.util.Scanner;

public class Forasg9
{
  
     public static void main(String[] args) 
     {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the range upto:");
      int range = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;   

          for(int iNo = 1; iNo <= range; iNo++)
          {
           if(iNo % 2 == 0 )

           {
            evenSum = evenSum + iNo;
           }

           else
           {
             oddSum = oddSum + iNo;
           }
           
          } 
          
          System.out.print("sum of even numbers is:"+ evenSum);
          System.out.print(" and sum of odd numbers is:"+ oddSum);

    }
    
}