


import java.io.File;
import java.io.IOException;

public class BadPractice {

    public static void main(String args[]) {
        try {
            createFile("c://testFile.txt");
        } catch (Exception e) {

            System.out.println("Problem creating the file!");

        }
    }

    public static void createFile(String fileName) throws IOException {
        File f = new File(fileName);
        f.createNewFile();
        int[] intArray = new int[5];
        intArray[5] = 27;
    }
}
