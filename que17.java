import java.util.*;

public class que17

{
    public static void main(String Args[])
      {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
          
           int iNo1 = sobj.nextInt();

        System.out.println("Enter the second Number: ");

           int iNo2 = sobj.nextInt();

             int Ans = iNo1 * iNo2;

        System.out.println("The Multiplication of the above number is: "+Ans);
 
      }
}