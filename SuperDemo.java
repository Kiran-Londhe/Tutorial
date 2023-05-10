
  class SuperDemo
  {
   public static void main(String Arg[])
   {

    Derived dobj = new Derived ();
    dobj.gun();
   }

  }
  class Base 
{
    public int A;
    public Base()
    {
    System.out.println("Inside Base default constructor");
    this.A = 11;
    }

    public Base(int i)
    {
     System.out.println("Inside Base parametrised constructor");
     this.A = i;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }

    }
class Derived extends Base
  {
public int A;
public Derived()
{
    super(11);
    System.out.println("Inside Base Derived constructor");
    this.A = 51;
}
public void gun()
{
    System.out.println("Inside Base Derived gun");
    System.out.println("Value 0f A :"+A);
    System.out.println("Value 0f A :"+this.A);
    System.out.println("Value 0f A :"+super.A);

    fun();
}
  }










