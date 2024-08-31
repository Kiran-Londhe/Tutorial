import java.util.*;

public class que16

{
    public static void main (String Args[])
    {
       Scanner sobj = new Scanner(System.in);

         System.out.println("Enter the first number: ");

           int iNo1 = sobj.nextInt();

         System.out.println("Enter the second Number: ");
           int iNo2 = sobj.nextInt();   

             int Ans = iNo1 / iNo2;

        System.out.println("Division is: "+Ans);
    }
}