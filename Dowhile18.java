//Generate the series... 1 -2 3 -4 ......-10

package loop;

public class Dowhile18
{
    
     public static void main(String[] args) 
     {
        
      int iNo = 1;

          
          do
          {
            if(iNo % 2 == 0)
            {
              System.out.print(-iNo + " " );
            }

            else
          {
            System.out.print(iNo + " " );
          }
          iNo++;
          }
          while(iNo <= 10);

         
    }
   
    
}
