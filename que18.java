import java.util.*;

public class que18

{
    public static void main(String Args [])
    {
       Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the first number for Addition: ");

       int iNo1 = sobj.nextInt();

     System.out.println("Enter the Second number for Addition: ");

         int iNo2 = sobj.nextInt();

           int Ans1 = iNo1 + iNo2;

      System.out.println("Enter the First number for Substraction: ");

         int iNo3 = sobj.nextInt();
  
      System.out.println("Enter the Second Number Subtraction: ");

         int iNo4 = sobj.nextInt();

           int Ans2 = iNo3 - iNo4;

      System.out.println("Enter the first number for multiplication: ");

         int iNo5 = sobj.nextInt();

      System.out.println("Enter the second number for Miltiplication: ");

         int iNo6 = sobj.nextInt();

            int Ans3 = iNo5 * iNo6;

      System.out.println("Enter the first Number for Division: ");
         int iNo7 = sobj.nextInt();

      System.out.println("Enter the Second number for Division: ");
         int iNo8 = sobj.nextInt();

         int Ans4 = iNo7 / iNo8;


          System.out.println("Addition of above Numbers are: "+Ans1);
            System.out.println("Substraction of the above numbers are:" +Ans2);
             System.out.println("Multiplication of the above numbers are:" +Ans3);
                 System.out.println("Division of the above number are:" +Ans4);

    }

    

}