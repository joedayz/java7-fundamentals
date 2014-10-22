


import java.io.File;
import java.io.IOException;

public class TestCheckedException {
    
    public static void main(String args[]) {
        
        try {
            testCheckedException();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void testCheckedException() throws IOException {

        File testFile = new File("//testFile.txt");
        testFile.createNewFile();

        System.out.println("File exists: " + testFile.exists());
        testFile.delete();
        System.out.println("File exists: " + testFile.exists());

    }

}
