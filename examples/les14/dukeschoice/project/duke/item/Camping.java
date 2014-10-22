package duke.item;

public abstract class Camping implements Searchable {

    private String sku = "";
    private int itemID = 0; // Default ID for the shirt
    private String description = "-description required-"; // default
    private double price = 0.0; // Default price for all items
    private int quantityInStock = 0;

    public Camping(int itemID, String description, double price, int quantityInStock) {
        this.sku = "" + itemID;
        this.itemID = itemID;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Camping() {
    }

    public double getPrice() {
        return price;
    }

    public void display() {

        System.out.println(getDisplay());

    }

    public String getDisplay() {
        String newLine = String.format("%n");
        return getDisplay(newLine);

    }

    public String getDisplay(String separator) {
        String displayString = "SKU: " + getSku() + separator
                + "Item: " + description + separator
                + "Price: " + price + separator
                + "Available: " + quantityInStock;
        ;
        return displayString;
    }

    public String getDescription() {
        return description;
    }

    public int getItemID() {
        return itemID;
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
