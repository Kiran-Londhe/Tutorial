 class student implements Clonable
 {
   public String name;
   public int marks;
   public int age;
 public Student(String str, int a, int b) 
    {

     this.name = str;
     this.mark = a;
     this.age = b;
        
       
    }

    public Object clone() throws exception
    {
        return super.clone();
    }
}
 
 
 class StringDemo
{


 public static void main(String arg[])

 {

  char Arr[] { 'H', 'e', 'l', 'l', 'o'};

  String str1 = new String (Arr);

   String str2 = "Hello";

   String str3 = new String ("Hello");

 }


 }
 
 