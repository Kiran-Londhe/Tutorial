// WAP to print 1 to 100 odd no

package frloop;

public class Forasg3
{
     public static void main(String[] args) 
     {

      System.out.print("Odd numbers from 1 to 100 are:");

          for(int iNo = 1; iNo <=100; iNo++)
          {
            if(iNo % 2 != 0)
            System.out.print(iNo+ " ");
          }
      
    }

}