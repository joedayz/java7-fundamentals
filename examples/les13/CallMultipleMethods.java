

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class CallMultipleMethods {

    public static void main (String args[]) throws Exception {

        System.out.println("Started in main()");
        MethodStackExample myUtils = new MethodStackExample();
        //try {
            myUtils.doThis();
        //}
        //catch (Exception e) { System.out.println(e);
        //}

        System.out.println("Back in main()");
    }

}
