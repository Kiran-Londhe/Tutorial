// Generate the series... 2 4 6 8 ......20
package loop;

public class Dowhile16
{
    
     public static void main(String[] args) 
     {
       
      int iNo = 2;

          
          do
          {
            if(iNo % 2 == 0)
            {
              System.out.print(iNo + " ");
            }

            iNo++;
          } 
          while( iNo <= 20 );   
          
    }
   
    
}
