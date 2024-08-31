// WAP to print odd and even no.

package loop;

public class Dowhile10 
{
    
     public static void main(String[] args) 
     {
       
      System.out.println("even numbers is:");

      int iNo = 1;
    
          do
          {
           if(iNo % 2 == 0 )

           {
            System.out.print(iNo+" ");
            
           }        
           iNo++;
           
          }
          while( iNo <= 100 );

           System.out.print(" ");

           iNo = 1;

           System.out.println("\nodd numbers is:");

           do
          {
           if(iNo % 2 != 0 )

           {
            System.out.print(iNo+" ");
            
           }
           iNo++;
            
          }   
          while(iNo <= 100 );    
                
    }
    
}
