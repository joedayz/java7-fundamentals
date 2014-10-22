


import java.io.File;
import java.io.IOException;

public class MultipleExceptionExample {
    public static void main (String args[]) {

        try {
            createFile();
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        } 
        catch (IllegalArgumentException iae) {
            System.out.println(iae);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void createFile() throws IOException {
        
        File testFile = new File("c://notWriteableDir"); // notWriteableDir is not writeable
        File tempFile = testFile.createTempFile("te", null, testFile);  // 1st parameter must be 3+ chars
        System.out.println("Temp filename is " + tempFile.getPath());
        //System.out.println("Temp file exists? " + tempFile.exists());
        int[] myInt = getTheIntArray(); // implicitly throws an ArrayIndexOutOfBoundsException
    }
    
    public static int[] getTheIntArray() {
        int myInt[] = new int[5]; 
        myInt[5] = 25;                  // 5 is not a valid index
        return myInt;
    }

}
