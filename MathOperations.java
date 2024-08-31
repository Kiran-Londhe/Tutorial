package statics;
public class MathOperations
{
   static int add(int a, int b)
   {
     
  
     int sum = a + b;

     return sum;
   }

   public static void main(String[] args) 
   {
    MathOperations m = new MathOperations();


    System.out.println("Addition of the above numbers is: "+m.add(5,7));
    System.out.println("Addition of the above numbers is: "+m.add(10,20));
   }
}