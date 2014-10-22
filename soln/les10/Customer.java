/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Customer {
    public int customerID = 0; // Default ID for the customer
    public String name = "-name required-"; // default
    public String address = "-address required-"; // default
    public String phoneNumber = "-phone required-"; // default
    public String eMail = "-email optional -"; // default
    
    public void setCustomerInfo(int Id, String nm, String addr, String phNum){
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = phNum;
    }
    
    public void setCustomerInfo(int Id,String nm,String addr, 
            String phNum,String email){
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = phNum;
        eMail = email;
    }
    
    public void display(){
        System.out.println("Customer ID: "+customerID);
        System.out.println("Customer name: "+name);
        System.out.println("Customer address: "+address);
        System.out.println("Customer phone: "+phoneNumber);
        System.out.println("Customer email: "+eMail);
    }
}
