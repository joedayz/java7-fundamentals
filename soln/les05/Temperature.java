/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Temperature {
    public float fahrenheitTemp = 78.9F;
    
    public void calculateCelsius(){
         System.out.println((fahrenheitTemp - 32) * 5 / 9);
    } //end calculateCelsius method
} // end class
