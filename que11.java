import java.util.*;

public class que11
{
   public static void main (String args[])

   {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter the Number:");

      int i = sobj.nextInt();

      sobj.close();

      if(i > 0)
      System.out.println("Number is Positive");

      else if(i < 0)
      System.out.println("Number is Negative");

      else 
      {
         System.out.println("Number is Zero");
      }
   }
}