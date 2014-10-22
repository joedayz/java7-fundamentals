/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Shirt {
  public int shirtID = 0; // Default ID for the shirt
  public String description = "-description required-"; // default
  
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'U';
  public double price = 0.0; // Default price for all items
  public int quantityInStock = 0; // Default quantity for all items
  
  // This method displays the values for an item
  public void display() {
    System.out.println("Item ID: " + shirtID);
    System.out.println("Item description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Item price: " + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // end of display method
} // end of class



