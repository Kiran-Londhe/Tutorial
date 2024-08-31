// Generate the series...0 1 1 2 3 5 8 13 21

package loop;

public class Dowhile23
{
    public static void main(String[] args) 
    {
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");
        int i = 2;

        
        do
        {
            int next = a + b;
            {
                System.out.print(next + " ");
            } 

            a = b;
            b = next;
            i++;
            
        }
        while ( i <= 21);
    }
}