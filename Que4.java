
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                //   QUESTION 4

        /*   4.	Write a program with a method named getTotal that accepts two integers as an argument and return its sum. 
        Call this method from main( ) and print the results. */

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  package com.exam;

 public class Que4
 {
   public int sum;

    public int getTotal(int iNo1, int iNo2)
    {
       sum = iNo1 + iNo2;

       return sum;
    }

    public static void main(String[] args) 
    
    {
        Que4 que = new Que4();
        que.getTotal(10,11);

        System.out.println("Addition of above num is:" +que.sum);

    }


 }