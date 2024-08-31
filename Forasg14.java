// WAP to print count of even number 1 to 25 no.

package frloop;

public class Forasg14
{
    
     public static void main(String[] args) 
     {
      int iCount = 0;

          for(int iNo = 1; iNo <= 25; iNo++)
          {
            if(iNo % 2 == 0)
            {
               iCount++;
            }
               
          }    
          System.out.print("The count of even number 1 to 25 is: " + iCount++);
    }
   
    
}
