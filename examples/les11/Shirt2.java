


public class Shirt2 {

    private int shirtID = 0; // Default ID for the shirt
    private String description = "-description required-"; // default
    // The color codes are R=Red, B=Blue, G=Green, U=Unset
    private char colorCode = 'U';
    private double price = 0.0; // Default price for all items

    public Shirt2() {
    }

    public Shirt2(char colorCode) {
        setColorCode(colorCode);
    }

    public Shirt2(char colorCode, double price) {

        this(colorCode);
        setPrice(price);

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char newCode) {

        switch (newCode) {
            case 'R':
            case 'G':
            case 'B':
                colorCode = newCode;
                break;
            default:
                System.out.println("Invalid colorCode. Use R, G, or B");
        }
    }
} // end of class

