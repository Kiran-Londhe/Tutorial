// Generate the series...4 8 12 16 20....40
package frloop;

public class Forasg27
{
    public static void main(String[] args) 
    {
        for (int iNo = 4; iNo <= 40; iNo++)
        {
            if(iNo % 4 == 0)
            {
                System.out.print(iNo + " ");
            }
        }
    }
}