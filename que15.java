import java.util.*;

public class que15

{
    public static void main(String Args [])
    {
      Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number:");

          int iNo1 = sobj.nextInt();

        System.out.println("Enter the second Number:");
          
          int iNo2 = sobj.nextInt();

               int Ans = iNo1 - iNo2;
               
        
         if(Ans < 0)
         {
          Ans = -Ans;
         }

         System.out.println("Substraction is: "+Ans);


    }
}