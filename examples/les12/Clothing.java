

public abstract class Clothing {

    private int itemID = 0; // Default ID for all clothing
    private String description = "-description required-"; // default
    private char colorCode = 'U';
    private double price = 0.0; // Default price for all clothing

// Constructor
    public Clothing(int itemID, String description, char colorCode,
        double price) {
        this.itemID = itemID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }

    public void display() {
        System.out.println("Item ID: " + getItemID());
        System.out.println("Item description: " + getDescription());
        System.out.println("Item price: " + getPrice());
        System.out.println("Color code: " + getColorCode());
    } // end of display method

    public void setDescription(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public abstract char getColorCode();

    public abstract void setColorCode(char colorCode);
    
} // end of class

