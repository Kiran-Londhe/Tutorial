// Generate the series...1 4 9 16 25 36 49 64 81 100
package frloop;

public class Forasg24
{
    public static void main(String[] args) 
    {
        for (int iNo = 1; iNo <= 10; iNo++)
        {
            int square = iNo * iNo;
            System.out.print(square);

            if (iNo < 10) 
            {
                System.out.print(" ");
            }
        }
    }
}