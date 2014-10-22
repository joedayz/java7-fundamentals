


import java.util.ArrayList;


public class ThrowError {
    
    public static void main (String args[]) {

        try {
            ArrayList theList = new ArrayList();
            while(true) {

                String theString = "A test String";

                theList.add(theString);

                if (theList.size()% 1000000 == 0) {
                    System.out.println("List now has " + theList.size()/100000 + " million elements!");
                }
            }
        }
        catch (OutOfMemoryError o) {
            //System.out.println(o.fillInStackTrace());
            o.printStackTrace();
        }
    }
    
}
