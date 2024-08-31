// Generate the series...3 6 9 12 15...30
package frloop;

public class Forasg25
{
    public static void main(String[] args) 
    {
        for (int iNo = 3; iNo <= 30; iNo++)
        {
            if(iNo % 3 == 0)
            {
                System.out.print(iNo + " ");
            }
        }
    }
}