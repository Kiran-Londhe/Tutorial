 /* 2.	Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. 

3.	Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

*/

package multilevel;

public class Student
{
    
    public void std(String name, int roll_no)
    {
        System.out.println("Name:"+ name + "\nRoll No:" +roll_no);
    }

    public void detailStd(String name, int roll_no, long phone_number, String address)
    {
        System.out.println("Name:"+ name +"\nRoll No:"+ roll_no + "\nPhone No:" +phone_number + "\nAddress:"+ address);
    }

   /*  public static void main(String[] args) 
    
    {
        Student s = new Student();
        
        // s.std("John",2);

        s.detailStd("Sam",4,8482925213L,"Ram nagar-1234");

        System.out.println("\n");

        s.detailStd("John",7,9890007602L,"Adarsh nagar-1234");

                       
    } */

}