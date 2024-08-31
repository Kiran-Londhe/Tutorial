// WAP to print -45 to 45 no
package loop;

public class Dowhile7 
{
    public static void main(String[] args) 
    {

        System.out.print("-45 to 45 numbers are: ");

        int iNo = -45;

        do 
        {
            System.out.print(iNo + " ");
            iNo++;
        } 
        while (iNo <= 45);

    }
}