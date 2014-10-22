

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class MethodStackExample {

    public void doThis() throws Exception {



        System.out.println("Arrived in doThis()");
        //try {
            doThat();
        //}
        //catch (Exception e) {
        //    System.out.println(e);
        //}
        System.out.println("Back in doThis()");

    }

    public void doThat() throws Exception {
        System.out.println("In doThat()");
        throw new Exception();
    }

}
