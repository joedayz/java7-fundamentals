/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CustomerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer cust1, cust2;
        cust1 = new Customer();
        cust2 = new Customer();
        
        // Assign values to member fields
        cust1.customerID = 1;
        cust1.name = "Mary Smith";
        cust1.emailAddress = "mary.smith@gmail.com";
        cust2.customerID = 2;
        cust2.name = "Frank Jones";
        cust2.emailAddress = "frank.jones@gmail.com";
        
        // Display customer info for each object
        cust2 = cust1;
        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
    }
}
