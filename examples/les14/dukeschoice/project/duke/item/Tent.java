package duke.item;

public class Tent extends Camping implements Returnable {

    // The tent types are =Red, B=Blue, G=Green,
    public int tentSize = 0; // Exception if invalid color code?

    public Tent(int itemID, String description, int tentSize, double price, int quantityInStock) {

        super(itemID, description, price, quantityInStock);
        this.tentSize = tentSize;
        setSku("" + itemID + "P" + tentSize);

    }

    public Tent() {
    }

    // This method displays the values for an item
    public void display() {

        super.display();
        System.out.println("Item size: " + tentSize + " person Tent.");

    }

    public String doReturn() {
        return "Instructions for returning a tent";
    }
}
