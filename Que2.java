
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                //   QUESTION 2


                              /*   2.	 Write a Java program to swap two variables. */

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  package com.exam;
public class Que2 

{
   static int a;
   static int b;

 public static void initializeValues() 
{
   a = 5;
   b = 10;
}

public static void swapValues() 
{
   int temp = a;
   a = b;
   b = temp;
}

   public static void main(String[] args) 
   {
     
       initializeValues();

       System.out.println("Before swapping: a = " + a + ", b = " + b);

      
       swapValues();

       System.out.println("After swapping: a = " + a + ", b = " + b);
   }
}