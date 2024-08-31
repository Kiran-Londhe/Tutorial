// Generate the series...1 2 3 4 5 4 3 2 1
package frloop;

public class Forasg29
{
    public static void main(String[] args) 
    {
        for (int iNo = 1; iNo <= 5; iNo++)
        {
            System.out.print(iNo + " ");
        }

        for (int iNo = 4; iNo >= 1; iNo--)
        {
            System.out.print(iNo);

            if (iNo > 1) 
            {
                System.out.print(" ");
            }
        }
    }
}