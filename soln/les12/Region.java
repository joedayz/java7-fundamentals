
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Region extends Company{
    private String region;
    private ArrayList countries = new ArrayList();
    private String regManager;
    private int annualSales;
    
    // Implement the method of the Printable interface
    public void print(){
        System.out.println("\tRegion: "+getRegion());
        System.out.println("\tRegional Manager: "+getRegManager());
        System.out.println("\tAnnual Sales: "+ this.getAnnualSales());
        System.out.println("\tCountries within this region: ");
        for(Object obj : getCountries()){
            System.out.println("\t\t"+obj);
        }
        System.out.println("****   ******");
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ArrayList getCountries() {
        return countries;
    }

    public void addCountry(String country) {
        countries.add(country);
    }

    public String getRegManager() {
        return regManager;
    }

    public void setRegManager(String regManager) {
        this.regManager = regManager;
    }

    public int getAnnualSales() {
        return this.annualSales;
    }

    public void setAnnualSales(int annualSales) {
        this.annualSales = annualSales;
    }
}
