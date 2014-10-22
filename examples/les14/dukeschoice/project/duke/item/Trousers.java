package duke.item;

public class Trousers extends Clothing implements Returnable {

    // The fits are S=Slim, R=Regular, C=Comforable, U=Unset
    private char fitCode = 'U';

    public Trousers(int itemID, String description, char colorCode, char fit, double price, int quantityInStock) {

        super(itemID, description, colorCode, price, quantityInStock);

        this.fitCode = fit;
        setSku(getSku() + fit);

    }

    public String getDisplay() {
        String newLine = String.format("%n");
        String displayString = "SKU: " + getSku() + newLine
                + "Item description: " + getDescription() + newLine
                + "Item price: " + getPrice() + newLine
                + "Color code: " + getColorCode() + newLine
                + "Fit: " + getFitCode() + newLine
                + "In stock: " + getQuantityInStock();
        return displayString;
    }

    public char getFitCode() {
        return fitCode;
    }

    public String doReturn() {
        return "Return within one week.";
    }
}
