package duke.item;

public class CampStove extends Camping implements Returnable {

    public CampStove(int itemID, String description, double price, int quantityInStock) {
        super(itemID, description, price, quantityInStock);
    }

    public String doReturn() {
        return "Must be unused.";
    }
}
