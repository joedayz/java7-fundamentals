
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SkilledEmployee extends Employee{
    public ArrayList skillList = new ArrayList();
    
    public void setSkill(String skill){
        skillList.add(skill);
    }
    
    public ArrayList getSkills(){
        return skillList;
    }
    // Practice 12-2:  Method name changed to implement interface
     public void print(){   
    //public void displayInformation(){
        super.print();
        System.out.println("Employee has the following skills: ");
        for(Object obj : skillList){
            System.out.println("\t"+ obj);
        }
    }

}
