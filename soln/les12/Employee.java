/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Employee implements Printable {
    protected static int employeeIDCounter = 0;
    private String name;
    private String jobTitle;
    private int employeeID;
    private int level;
    
    public void calculateEmployeeID(){
        employeeIDCounter++;  // increment so that employeeID will be unique
        setEmployeeID(employeeIDCounter);
    }
    
    // Practice 12-2:  Method name changed to implement interface
    // public void displayInformation(){
    public void print(){
        System.out.println("Name: "+ getName());
        System.out.println("Job Title: "+ getJobTitle());
        System.out.println("Employee ID: "+ getEmployeeID());
        System.out.println("Level: "+ getLevel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    private void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
