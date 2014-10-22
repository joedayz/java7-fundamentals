
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
    public void print(){   
    	  super.print();
        System.out.println("Employee has the following skills: ");
        for(Object obj : skillList){
            System.out.println("\t"+ obj);
        }
    }

}
