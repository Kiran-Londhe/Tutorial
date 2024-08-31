// WAP to print count of odd number 1 to 25 no.

package loop;

public class Dowhile15
{
    
     public static void main(String[] args) 
     {
      int iCount = 0;
      int iNo = 1;

          
          do
          {
            if(iNo % 2 != 0)
            {
               iCount++;
            }
            iNo++; 
          }    
          while(iNo <= 25);
          System.out.print("The count of odd number 1 to 25 is: " + iCount++);
    }
   
    
}
