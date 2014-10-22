
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Country extends Region{
    private String country;
    private String countryManager;
    private ArrayList languages = new ArrayList();
        
    // Implement the method of the Printable interface
    public void print(){
        System.out.println("\tCountry: "+getCountry());
        System.out.println("\tCountry Manager: "+getCountryManager());
        System.out.println("\tPredominant languages spoken in this country: ");
        for(Object obj : getLanguages()){
            System.out.println("\t\t"+obj);
        }
        System.out.println("****   ******");
    }

    public String getCountry() {
        return country;
    }

   public void setCountry(String country){
       this.country = country;
   }
    public String getCountryManager() {
        return countryManager;
    }

    public void setCountryManager(String countryManager) {
        this.countryManager = countryManager;
    }

    public ArrayList getLanguages() {
        return languages;
    }

    public void setLanguage(String language) {
        languages.add(language);
    }
}
