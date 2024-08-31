import java.util.*;

public class que13
{
  public static void main (String Args[])
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the First number:");
 
         int iNo1 = sobj.nextInt();

          System.out.println("Enter the Second number:");
 
         int iNo2 = sobj.nextInt();


         int Ans = iNo1 - iNo2;

          if(iNo1 < iNo2)
      {
        System.out.println("Invalid number: first number should be greater than second number");
      }
        else
      {
       System.out.println("Substraction is: "+Ans);
  
      }

   }

   
  
}