/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ChallengeSequence {
    public int firstNumber = 0;
    public int secondNumber = 1; 
    public int nextNumber;
    public final int SEQUENCE_LIMIT = 100;
    public final int SEQUENCE_COUNT = 10;
    
    public void displaySequence(){
        // Display the first two numbers of the sequence
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        // Calculate the next number of the sequence
        nextNumber = firstNumber + secondNumber;
        
        for (int count = 2; count < SEQUENCE_COUNT; count++){
            // Start at 2 and loop until you get to 9 (8 numbers)
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber; // new firstNumber
            secondNumber = nextNumber; // new secondNumber
            nextNumber = firstNumber + secondNumber; 
        }
        // Finish it off with a carriage return
        System.out.println();
    }
}
