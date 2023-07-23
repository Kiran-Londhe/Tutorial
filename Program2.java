

import java.util.*;

class Program2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name :");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        int iRet = obj.CountSmall(name);
        System.out.println("Numbr of Small character are :"+iRet);
    }

}

class StringX
{
   public int CountSmall(String str)
   {

    char Arr[] = str.toCharArray();
    int iCount = 0;

    for(int iCnt = 0; iCnt < Arr.length; iCnt++)
    {
       if((Arr[iCnt] >= 'a') && (Arr[iCnt])<= 'z')
       {
        iCount++;
       }
    }
      return iCount;
   }
}


