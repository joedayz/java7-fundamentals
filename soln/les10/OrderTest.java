/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class OrderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shirt shirt = new Shirt(),
                shirt2 = new Shirt(),
                shirt3 = new Shirt();
        Order order = new Order();
        double totalCost = 0.0;

        shirt.price = 14.99;
        shirt2.price = 23.55;
        shirt3.price = 49.99;
        order.addShirt(shirt);
        order.addShirt(shirt2);
        totalCost = order.addShirt(shirt3);
        System.out.println("Total amount for the order is $" + totalCost);
    }
}
