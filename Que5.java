
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                //   QUESTION 5

        /*   5.	Write a program to print the circumference and area of a circle of radius entered 
                  by user by defining your own method. */

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  package com.exam;

public class Que5 
{
  static final double PI = 3.14159;

   int circumference;
   int radius;
   double area;

   public void calculateCircumference() 
   
   {
       circumference = (int) (2 * PI * radius);
       area = PI * radius * radius;
   }

   public static void main(String[] args) 
   
   {
       Que5 que = new Que5();

       que.radius = 5;

       que.calculateCircumference();

       System.out.println("Circumference of the circle: " + que.circumference);
       System.out.println("Area of the circle: " + que.area);
   }
}