//Generate the series... 1 -2 3 -4 ......-10

package frloop;

public class Forasg18
{
    
     public static void main(String[] args) 
     {
     
          for(int iNo = 1; iNo <= 10; iNo++)
          {
            if(iNo % 2 == 0)
            {
              System.out.print(-iNo + " " );
            }

            else
          {
            System.out.print(iNo + " " );
          }
          
          }
         
    }
   
    
}
