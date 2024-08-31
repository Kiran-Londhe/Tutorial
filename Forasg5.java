// WAP to print sum of 1 to 50 odd no

package frloop;

public class Forasg5
{
     public static void main(String[] args) 
     {
      int isum = 0;

     

          for(int iNo = 1; iNo <=50; iNo++)
          {
            if(iNo % 2 != 0)

             isum = isum + iNo;
          }
          System.out.print("sum of 1 to 50 odd no is: " +isum);
    }

}