package constructor;
public class Product
{

    int productId;
    String productName;
    double price;
    int quantityStok;

   // parameterised constructor

   Product(int productId, String productName, double price, int quantityStok)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityStok = quantityStok;
        
    }

    //Default Constructor

    Product()
    {
        this.productId = 0;
        this.productName = "";
        this.price = 0.0;
        this.quantityStok = 0;

    }

    public void updateQuantity(int newQuentity)
    {

        this.quantityStok = newQuentity;
    }

    public void printInfo()
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity Stok: " + quantityStok);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) 
    {
        // Create objects using the default constructor
        Product pd = new Product();
        pd.printInfo();

        // Create objects using the parameterized constructor
        Product pd1 = new Product(101, "Laptop", 999.99, 50);
        pd1.printInfo();

        Product pd2 = new Product(102, "Smartphone", 499.99, 100);
        pd2.printInfo();

        // Update quantity of products in stock and print product information after each update
        pd1.updateQuantity(40);
        pd1.printInfo();

        pd2.updateQuantity(80);
        pd2.printInfo();

    }
}