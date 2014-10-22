/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Order {
  public double totalPrice = 0.0; // Default price for order
  
  public double addShirt (Shirt shirt) {
    totalPrice = totalPrice + shirt.price;
    return totalPrice;
  }
} // end of class



