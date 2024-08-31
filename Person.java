package constructor;

public class Person

{
    String name;
    int age;

    public Person(String name, int age)
    {

        this.name = name;
        this.age = age;

    }

    public static void main(String args[])
    {
        Person p1 = new Person("Vivek", 28);
        Person p2 = new Person("Aniket", 58);
        Person p3 = new Person("Vishal", 44);
        Person p4 = new Person("Kaivalya", 64);

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
        System.out.println(p3.name+" "+p3.age);
        System.out.println(p4.name+" "+p4.age);

    }
}