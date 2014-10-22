
public class Customer {

  public int customerID = 0; // Default ID for the customer
  public String name = "-name required-"; // default
  public String emailAddress = "-email required-"; // default
  

  // This method displays the values for an item
  public void displayCustomerInfo() {
    System.out.println("********Customer Information********");
    System.out.println("Customer ID: " + customerID);
    System.out.println("Name:" + name);
    System.out.println("Email: " + emailAddress);
    System.out.println("************************************");
  } // end of display method
} // end of class



