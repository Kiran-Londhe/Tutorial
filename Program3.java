

import java.util.*;

class Program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name :");
        String name = sobj.nextLine();

        StringX obj1 = new StringX();
        int iRet = obj1.CountSmall(name);
        System.out.println("Numbr of Small character are :"+iRet);

        StringX obj2 = new StringX();
         iRet = obj2.CountCapital(name);
        System.out.println("Numbr of Capital character are :"+iRet);

        StringX obj3 = new StringX();
        iRet = obj3.CountDiff(name);
        System.out.println("Difference between small and captila chracter are :"+iRet);
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

   public int CountCapital(String str)
   {

    char Arr[] = str.toCharArray();
    int iCount = 0;

    for(int iCnt = 0; iCnt < Arr.length; iCnt++)
    {
       if((Arr[iCnt] >= 'A') && (Arr[iCnt])<= 'Z')
       {
        iCount++;
       }
    }
      return iCount;
   }


    public int CountDiff(String str)
    {
      int CountCapital = CountCapital(str);
      int CountSmall = CountSmall(str);
      
      return CountCapital - CountSmall;
    }
   
}


