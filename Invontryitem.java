package statics;

public class Invontryitem
{  
    static int totalitems;
    String itemName;
    int quantity;

    Invontryitem(String itemName, int quantity)
    {
        this.itemName = itemName;
        this.quantity = quantity;
    }

     static int getTotalItem()
    {
        return totalitems;

    }

    void addToInventory(int itemQuantity)
    {
        this.quantity = this.quantity + itemQuantity;
        this.totalitems = totalitems + itemQuantity;


    }

    void removeFromInventory(int itemQuantity)
    {
        this.quantity = this.quantity - itemQuantity;
        this.totalitems = totalitems - itemQuantity;

    }

    public static void main(String[] args) 
    
    {
        Invontryitem m = new Invontryitem("Book", 20);

        m.addToInventory(100);
        m.removeFromInventory(50);

        System.out.println(m.getTotalItem());

    }

    
}