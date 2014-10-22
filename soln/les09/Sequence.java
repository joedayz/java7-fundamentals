/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Sequence {
    public int firstNumber = 0;
    public int secondNumber = 1;
    public int nextNumber;
    public final int SEQUENCE_LIMIT = 100;
    
    public void displaySequence(){
        // Display the first two numbers of the sequence
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        // Calculate the next number of the sequence
        nextNumber = firstNumber + secondNumber;
        
        while(nextNumber <= SEQUENCE_LIMIT){
            // Print the next number of the sequence
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber; // new firstNumber
            secondNumber = nextNumber; // new secondNumber
            // calculate next potential number in sequence
            nextNumber = firstNumber + secondNumber; 
        } // end of while loop
        // Finish it off with a carriage return
        System.out.println();  
    } // end of method
} // end of class declaration
