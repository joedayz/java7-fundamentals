package duke.item;

public abstract class Clothing implements Searchable {

    private String sku = "";
    private int itemID = 0; // Default ID for all clothing items
    private String description = "-description required-"; // default
    private char colorCode = 'U'; // Class extending Clothing override the setter method as needed
    private double price = 0.0; // Default price for all items
    private int quantityInStock = 0;

    public Clothing(int itemID, String description, char colorCode, double price, int quantityInStock) {
        this.itemID = itemID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.sku = "" + itemID + colorCode;

    }

    public Clothing() {
    }

    public double getPrice() {
        return price;
    }

    public void display() {

        System.out.println(getDisplay());

    } // end of display method

    public String getDisplay() {
        String newLine = String.format("%n");
        return getDisplay(newLine);

    }

    public String getDisplay(String separator) {

        String displayString = "SKU: " + getSku() + separator
                + "Item: " + description + separator
                + "Price: " + price + separator
                + "Color: " + colorCode + separator
                + "Available: " + quantityInStock;
        return displayString;
    }

    public String getShippingInstructions() {
        return "Ship " + description + " in a cardboard box";
    }

    public String getDescription() {
        return description;
    }

    public int getItemID() {
        return itemID;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
