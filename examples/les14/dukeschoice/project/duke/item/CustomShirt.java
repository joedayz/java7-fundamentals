package duke.item;

public class CustomShirt extends Clothing {

    // Extra field for custom made shirt
    private double neckSize = 0;

    public CustomShirt(int itemID, String description, char colorCode, int neckSize, double price, int quantityInStock) {

        super(itemID, description, colorCode, price, quantityInStock);
        setNeckSize(neckSize);

    }

    public double getNeckSize() {
        return neckSize;
    }

    // Could check for a valid neck size value here before setting
    public void setNeckSize(double neckSize) {
        this.neckSize = neckSize;
    }
}
