// WAP to print sum of 1 to 50 even no

package loop;

public class Dowhile6 
{
    public static void main(String[] args) 
    {

        int isum = 0;
        int iNo = 1;

        do 
        {
            if (iNo % 2 == 0) 
            {
                isum = isum + iNo;
            }
            iNo++;
        } 
        while (iNo <= 50);

        System.out.print("Sum of 1 to 50 even numbers is: " + isum);
    }
}