/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Company implements Printable{
    private String companyName;
    private int taxID;
    private String CEO;
    
    // Implement the method of the Printable interface
    public void print(){
        System.out.println("Company: "+ getCompanyName());
        System.out.println("TaxID: "+ getTaxID());
        System.out.println("The CEO is "+getCEO());
        System.out.println("*******  ******");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTaxID() {
        return taxID;
    }

    public void setTaxID(int taxID) {
        this.taxID = taxID;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }
}
