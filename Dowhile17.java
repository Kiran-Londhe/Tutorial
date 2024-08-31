// Generate the series... 9 18 27 36 ......90

package loop;

public class Dowhile17
{
    
     public static void main(String[] args) 
     {
      int iNo = 9;
     
          
          do
          {
            if(iNo % 9 == 0)
            {
              System.out.print(iNo + " ");
            }
            iNo++;
           
          }   
          while(iNo <= 90);
          
    }
   
    
}
