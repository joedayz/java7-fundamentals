/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Editor extends SkilledEmployee {
    private boolean prefersPaperEditing;
    
    public void setPrefersPaperEditing(boolean pref){
        prefersPaperEditing = pref;
    }
    
    public String getEditingPreference(){
        if(prefersPaperEditing){
            return "Paper";
        }
        else {
            return "Electronic";
        }
    }
    
    // Practice 12-2:  Method name changed to implement interface
    // public void displayInformation(){
    public void print(){
        super.print();
        System.out.println("Editing preference: " + this.getEditingPreference());
    }
}
