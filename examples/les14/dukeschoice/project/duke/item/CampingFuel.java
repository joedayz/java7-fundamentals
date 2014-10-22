package duke.item;

// Notice that CampingFuel doesn't implement Returnable
public class CampingFuel extends Camping {

    private char cannisterSize = 'U';  // (S)mall, (M)edium, (L)arge

    public CampingFuel(int itemID, String description, char cannisterSize, double price, int quantityInStock) {

        super(itemID, description, price, quantityInStock);
        this.cannisterSize = cannisterSize;
        setSku("" + itemID + cannisterSize);

    }

    public void display() {

        super.display();
        System.out.println("Item size: " + getCannisterSize() + " ml of Fuel.");

    }

    public char getCannisterSize() {
        return cannisterSize;
    }

    public void setCannisterSize(char cannisterSize) {
        this.cannisterSize = cannisterSize;
    }
}
