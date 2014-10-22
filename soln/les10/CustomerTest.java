/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CustomerTest {
   
  public static void main (String args[]) {
      Customer c1 = new Customer(),
               c2 = new Customer();
      c1.setCustomerInfo(1, "Harry", "234 Maple St", "505-123-4545");
      c2.setCustomerInfo(2, "Sally", "567 Oak St", "505-123-2323",
              "sally@gmail.com");
      c1.display();
      c2.display();
  } 
}
