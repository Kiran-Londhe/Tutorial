
 import java.util.*;

 class Program4
  {
    
     public static void main(String[] Arg) 
     {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter name :");
      String name = sobj.nextLine();

      StringX obj1 = new StringX();
      boolean StringX = obj1.CheckVowels(name);
      
         
         if(StringX == true)
         {
             System.out.println("true");
         }
         else
         {
             System.out.println("false");
         }
         
         
     }
 }
 
 class StringX 
 {
   boolean CheckVowels(String str)
    {
       char Arr[] = str.toCharArray();

       for (int iCnt = 0; iCnt < Arr.length; iCnt++) 
       {
           if ((Arr[iCnt] == 'a') || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'i') || (Arr[iCnt] == 'o') || (Arr[iCnt] == 'u')
                   || (Arr[iCnt] == 'A') || (Arr[iCnt] == 'E') || (Arr[iCnt] == 'I') || (Arr[iCnt] == 'O') || (Arr[iCnt] == 'U'))
                    {
               return true;
           }
       }

       return false;
   }
}













   