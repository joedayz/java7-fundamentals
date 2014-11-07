
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
    
    public void setSkill(String skill) throws InvalidSkillException{
        //skillList.add(skill);
        Boolean valid = true;
        if(skill == null | skill.length() <5){
            valid = false;
        }else{
            valid = true;
        }
        if(!valid){
            throw new InvalidSkillException(skill +
                    " is not valid for the " +
                    this.getJobTitle() + " job.");
        }else{
            skillList.add(skill);
        }
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
