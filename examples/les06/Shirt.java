
public class Shirt {
  public int shirtID = 0; // Default ID for the shirt
  public String description = "-description required-"; // default
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'U';
  // This method displays the details for an item
  public double price = 0.0; // Default price all items
  // This method displays the details for an item

  public void display() {
    System.out.println("Item ID: " + shirtID);
    System.out.println("Item description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Item price: " + price);
  } // end of display metho
} // end of class

