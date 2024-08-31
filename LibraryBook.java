// create java project for library Management
package constructor;

import java.util.*;

 class LibraryBook
{
    int idNo;
    String title;
    String author;
    String isbn;
    boolean available;

    LibraryBook(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;

    }

    /*  void checkId()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID:");

        int providedId = scanner.nextInt();

        if (providedId == 1234) 

        {
            System.out.println("ID card match");
        } 
        
        else 

        {
            System.out.println("Invalid ID, can't buy the book");
        }
        
        scanner.close(); 
    }
   */

    void borrowBook()
    {
       
        this.available = false;
    }

    void returnBook()
    {
        this.available = true;
    }


    public static void main(String[] args) 
    {
        LibraryBook b1 = new LibraryBook("\nTitle Book => Chhava", "\nAuthor => Shivaji Sawant","\nISBN No => SIV67-984");
        LibraryBook b2 = new LibraryBook("\nTitle Book => A Tour of C++", "\nAuthor => Bjarne Stroustrup","\nISBN No => BJ6584");
        LibraryBook b3 = new LibraryBook("\nTitle Book => Effective Java", "\nAuthor => Bloch Joshua","\nISBN No => Bl-984");
        LibraryBook b4 = new LibraryBook("\nTitle Book => Operating System", "\nAuthor => Rohit Khurana ","\nISBN No => RIV6784");
        LibraryBook b5 = new LibraryBook("\nTitle Book => Linux Kernel Development", "\nAuthor =>  Robert Love","\nISBN No => RL98-654");


        System.out.println(b1.title+" "+b1.author+" "+b1.isbn+ " \n"+b1.available);
        System.out.println(b2.title+" "+b2.author+" "+b2.isbn+ " \n"+b2.available);
        System.out.println(b3.title+" "+b3.author+" "+b3.isbn+ " \n"+b3.available);
        System.out.println(b4.title+" "+b4.author+" "+b4.isbn+ " \n"+b4.available);
        System.out.println(b5.title+" "+b5.author+" "+b5.isbn+ " \n"+b5.available);
            System.out.println("-------------------------------------------");

       /*  b1.checkId();
        b2.checkId();
        b3.checkId();
        b4.checkId();
        b5.checkId();
  */
        b1.borrowBook();
        b2.borrowBook();
        b3.borrowBook();
        b4.borrowBook();
        
        System.out.println(b1.title+" "+b1.author+" "+b1.isbn+ " \n"+b1.available);
        System.out.println(b2.title+" "+b2.author+" "+b2.isbn+ " \n"+b2.available);
        System.out.println(b3.title+" "+b3.author+" "+b3.isbn+ " \n"+b3.available);
        System.out.println(b4.title+" "+b4.author+" "+b4.isbn+ " \n"+b4.available);
        System.out.println(b5.title+" "+b5.author+" "+b5.isbn+ " \n"+b5.available);
 
       
        
    }

}
