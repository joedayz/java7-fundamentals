/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ClassMap {
    public String[][] deskArray;
    public String name;
    
    public void setClassMap(){
        deskArray = new String[3][4];
    }
    
    public void setDesk(){
        boolean flag = false;
        for (int row = 0; row < 3; row++) { // start of row loop
            for (int col = 0; col < 4; col++) { // start of column loop
                if (deskArray[row][col] == null) {
                    deskArray[row][col] = name;
                    System.out.println(name + "  desk set at position: Row:"
                             + row + " Column:" + col);
                    flag = true;
                    break; // drop out of column loop
                } // end of if
            } // end of inner/column loop
            if (flag == true) {
                break;
            } // end of if
        } // end of outer/row loop
        if (flag == false) {
            System.out.println("All desks occupied.");
        } // end of if
    }
    
    //method to diplay the desk map of the class
    public void displayDeskMap() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("  " + deskArray[row][col] + "  ");
            }
            System.out.println();
        }

    }//end method
    
    //Challenge Practice: method to search the desk of a student
    public void searchDesk() {
        boolean flag = false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (deskArray[row][col] != null && deskArray[row][col].equals(name)) {
                    System.out.println(name + "  Desk Position:  Row:  " +row+ "  Column:  "+col);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        if (flag == false) {
            System.out.println("Desk not allocated for:   " + name);
        }
    } //end method
}
