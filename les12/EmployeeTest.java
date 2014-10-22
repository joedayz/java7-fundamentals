/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager myManager = new Manager();
        Editor myEditor = new Editor();
        GraphicIllustrator myGI = new GraphicIllustrator();
        TechnicalWriter myTW = new TechnicalWriter();

        myEditor.setName("Fred Hanson");
        myEditor.setJobTitle("Editor");
        myEditor.calculateEmployeeID();
        myEditor.setLevel(1);
        myEditor.setSkill("technical editing");
        myEditor.setSkill("typing");
        myEditor.setPrefersPaperEditing(true);
        myEditor.displayInformation();
        System.out.println("**** *****");

        myGI.setJobTitle("Graphic Illustrator");
        myGI.setName("Frank Moses");
        myGI.calculateEmployeeID();
        myGI.setLevel(3);
        myGI.setSkill("technical illustration");
        myGI.setSkill("video production");
        myGI.setSkill("media authoring");
        myGI.displayInformation();
        System.out.println("**** *****");

        myTW.setName("James Ralph");
        myTW.setJobTitle("Technical Writer");
        myTW.calculateEmployeeID();
        myTW.setLevel(1);
        myTW.setSkill("technical writing");
        myTW.displayInformation();
        System.out.println("**** *****");

        myManager.setName("Susan Smith");
        myManager.setJobTitle("Manager");
        myManager.calculateEmployeeID();
        myManager.setLevel(2);
        myManager.setEmployee(myEditor);
        myManager.setEmployee(myGI);
        myManager.setEmployee(myTW);
        myManager.displayInformation();
    }
}
