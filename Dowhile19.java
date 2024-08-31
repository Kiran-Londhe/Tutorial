// Generate the series... 5 10 15 20 ......50

package loop;

public class Dowhile19
{
    
     public static void main(String[] args) 
     {
      int iNo = 5;

         
         do
          {
           
             if(iNo % 5 == 0)
            {
              System.out.print(iNo + " " );
            }
            iNo++;
          }
          while(iNo <= 50);
    }
   
    
}
