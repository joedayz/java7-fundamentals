/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class DateThreeTest {
  public static void main(String args[]){
      DateThree date = new DateThree();
      date.setMonth(10);
      date.setDay(16);
      date.setYear(2011);
      
      System.out.println("The date is: " + date.getMonth() + "/" 
                + date.getDay() + "/" + date.getYear());

        // Challenge Practice 11-2
        //Test with valid values for  month, day and year 
        date.setDate(30, 12, 2011);
        date.displayDate();

        //Test with invalid value for month 14
        date.setDate(30, 14, 2011);
        date.displayDate();

        //Test with invalid value for day 35
        date.setDate(35, 5, 2011);
        date.displayDate();

        //Test with invalid value for year 200
        date.setDate(30, 10, 200);
        date.displayDate();

  } // end main
} // end class
