// Generate the series...10 20 30 40 50....100
package frloop;

public class Forasg28
{
    public static void main(String[] args) 
    {
        for (int iNo = 10; iNo <= 100; iNo++)
        {
            if(iNo % 10 == 0)
            {
                System.out.print(iNo + " ");
            }
        }
    }
}