/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class InvalidSkillException extends Exception {

    /**
     * Creates a new instance of <code>InvalidSkillException</code> without detail message.
     */
    public InvalidSkillException() {
    }

    /**
     * Constructs an instance of <code>InvalidSkillException</code> with the specified detail message.
     * This exception is thrown when an attempt is made to add an invalid skill to an employee, 
     * given the employee's job role.
     * @param msg - The message that describes the exception.
     */
    public InvalidSkillException(String msg) {
        super(msg);
    }
}
