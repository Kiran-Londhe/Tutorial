
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                //   QUESTION 1
/*1. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
 */

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  package com.exam;

 public class Que1
 {
    public int division;

    public void divideNum(int iNo1, int iNo2)
    {
       division = (iNo1 / iNo2);
    }

    public static void main(String[] args) 
    
    {
        Que1 que = new Que1();
        que.divideNum(50,3);

        System.out.println("The division of above two numbers is:" + que.division);
    }


 }