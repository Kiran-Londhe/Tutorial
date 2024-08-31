
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                //   QUESTION 3


                              /*   Write a Java method to check whether the char is digit, symbol or alphabet. */

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  package com.exam;

 public class Que3
 {
    public void check(char iNo)
    {
       if(iNo >= '0' && iNo <= '9')
       {
         System.out.println("its a digit");
       }

       else if((iNo >= 'a' && iNo <= 'z') || (iNo >= 'A' && iNo <= 'Z'))
       {
           System.out.println("Its a character:");
       }

       else
       {
         System.out.println("Its a symbol:");
       }
    }

    public static void main(String[] args) 
    
    {
        Que3 que = new Que3();
        que.check('9');

    }


 }