// Generate the series...1 3 6 10 15 21 28 36 45.

package loop;

public class Dowhile21
{
    
     public static void main(String[] args) 
     {
        int isum = 0;
        int iNo = 1;

          
          do
          {
              
              isum += iNo;
              {
                System.out.print(isum + " " );
              } 
             
             iNo++;
          
          }
          while(iNo <= 9);
         
    }
   
    
}
