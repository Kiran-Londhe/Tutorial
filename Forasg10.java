// WAP to print odd and even no.

package frloop;

public class Forasg10
{
    
     public static void main(String[] args) 
     {
       
      System.out.println("even numbers is:");

          for(int iNo = 1; iNo <= 100; iNo++)
          {
           if(iNo % 2 == 0 )

           {
            System.out.print(iNo+" ");
           }
          }

           System.out.print(" ");

           System.out.println("\nodd numbers is:");

           for(int iNo = 1; iNo <= 100; iNo++)
          {
           if(iNo % 2 != 0 )

           {
            System.out.print(iNo+" ");
           }

          
          }               

    }
    
}
