
public class NestedLoopExamples {
    public static void main (String args[]) {
        
        // Uncomment the examples you wish to run.
        //nestedLoop();
        //matchName();
        matchNameByLetter();

    }

    // Nested loop to print a block of characters
    public static void nestedLoop() {
        int height = 4;
        int width = 10;
        for (int rowCount = 0; rowCount < height; rowCount++ ) {
            for (int colCount = 0; colCount < width; colCount++ ) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    // Nested loop to guess a name by randomly creating a word of the same length
    // The words created are not checked to see if they are real words, only if they match the name.
    // Names 5 letter long may take minutes to guess (but usually not); names longer may take much longer!
    public static void matchName() {
        String name = "Lenny";
        String guess = "";
        int numTries = 0;

        while (!guess.equals(name.toLowerCase())) {
            guess = "";
            while (guess.length() < name.length()) {
                char asciiChar = (char)(Math.random() * 26 + 97);
                guess = guess + asciiChar;
            }
            numTries++;
        }
        System.out.println(name + " was found after " + numTries + " tries!");
    }

    // Nested loop to guess a name character by character. Prints out all tries,
    // capitalizing the latest found letter.
    public static void matchNameByLetter() {
        String name = "Carol";
        String nameToFind = name.toLowerCase();
        String guess = "";
        char guessChar = 'a';

        int numTries = 0;

        for (int i = 0; i < nameToFind.length(); i++) {

            while (nameToFind.charAt(i) != guessChar) {
                guessChar = (char)(Math.random() * 26 + 97);
                System.out.println(guess + guessChar);
                numTries++;
             }
            System.out.println(guess + (guessChar + "").toUpperCase() + " found '" + guessChar + "'");
            guess = guess + guessChar;
            //System.out.println(guess);
         }


         //System.out.println(guess);

         System.out.println(name + " was found after " + numTries + " tries!");
    }


}
