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
        Printer myPrinter = new Printer();
        Manager myManager = new Manager();
        Editor myEditor = new Editor();
        GraphicIllustrator myGI = new GraphicIllustrator();
        TechnicalWriter myTW = new TechnicalWriter();

        myEditor.setName("Fred Hanson");
        myEditor.setJobTitle("Editor");
        myEditor.calculateEmployeeID();
        myEditor.setLevel(1);
        try {
            myEditor.setSkill("technical editing");
            myEditor.setSkill("typing");
        } catch (InvalidSkillException ex) {
            System.out.println(ex);
        }
        myEditor.setPrefersPaperEditing(true);
        myPrinter.printToScreen(myEditor);
        System.out.println("**** *****");

        myGI.setJobTitle("Graphic Illustrator");
        myGI.setName("Frank Moses");
        myGI.calculateEmployeeID();
        myGI.setLevel(3);
        try {
            myGI.setSkill("technical illustration");
            myGI.setSkill("video production");
            myGI.setSkill("media authoring");
        } catch (InvalidSkillException ex) {
            System.out.println(ex);
        }
        myPrinter.printToScreen(myGI);
        System.out.println("**** *****");

        myTW.setName("James Ralph");
        myTW.setJobTitle("Technical Writer");
        myTW.calculateEmployeeID();
        myTW.setLevel(1);
        try {
            myTW.setSkill("tw");
        } catch (InvalidSkillException ex) {
            System.out.println(ex);
        }
        myPrinter.printToScreen(myTW);
        System.out.println("**** *****");

        myManager.setName("Susan Smith");
        myManager.setJobTitle("Manager");
        myManager.calculateEmployeeID();
        myManager.setLevel(2);
        myManager.setEmployee(myEditor);
        myManager.setEmployee(myGI);
        myManager.setEmployee(myTW);
        myPrinter.printToScreen(myManager);
    }
}
