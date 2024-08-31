// Generate the series...7 14 21 28 35....70
package frloop;

public class Forasg26
{
    public static void main(String[] args) 
    {
        for (int iNo = 7; iNo <= 70; iNo++)
        {
            if(iNo % 7 == 0)
            {
                System.out.print(iNo + " ");
            }
        }
    }
}