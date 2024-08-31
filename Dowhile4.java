// WAP to print 1 to 100 even no

package loop;

public class Dowhile4 
{
    public static void main(String[] args) 
    {

        System.out.print("Even numbers from 1 to 100 are:");

        int iNo = 1;

        do 
        {
            if (iNo % 2 == 0) {
                System.out.print(iNo + " ");
            }
            iNo++;
        } 
        while (iNo <= 100);

    }

}