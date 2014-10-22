/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Shirt {
    public int shirtID = 0;
    public String description = "-description required-";
    // The color codes are 'U'=Unset,'R'=Red,'G'=Green,'B'=Blue
    public char colorCode = 'U';
    public double price = 0.0;
    public int quantityInStock = 0;
    
    // Method to display Shirt field values
    public void displayInformation(){
          System.out.println("Shirt ID: "+ shirtID);
          System.out.println("Description: "+ description);
          System.out.println("Color Code: "+ colorCode);
          System.out.println("Price: "+ price);
          System.out.println("Quantity in stock: " + quantityInStock);
    } // end of method
}  // end of class