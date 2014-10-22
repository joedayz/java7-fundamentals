
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class DateManipulator {

    Date myDate;
    SimpleDateFormat simpleDF = new SimpleDateFormat("MM/dd/yyyy");

    public void parseDate(String dateString) {
        try {
            String formattedDateString;
            myDate = simpleDF.parse(dateString);
            System.out.println("Parse successful");
            // Date displayed with its native formatting
            System.out.println("Date with native format: " + myDate);
            // Format the Date object
            formattedDateString = simpleDF.format(myDate);
            System.out.println("Formatted date: " + formattedDateString);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }
}
