
public class LoopsWithArrays {

    public static void main (String args[]) {

        // Uncomment the examples you wish to run.
        //enhancedFor();
        //checkPassUnit();
        //checkPassNUnits();

    }

    // Simple example to show enhanced for loop
    // Note the simplified code, but note no access to index and
    // no way to set a value, only get a value.
    public static void enhancedFor() {

        int[] ages = {3, 0 , 56, 7, 2, 2 } ;

        for (int i = 0; i < ages.length ; i++ ) {
            System.out.println("Age is " + ages[i] );
            if (i%2!=0) ages[i] = 1;    // set every element with an odd index to 1
        }
        System.out.println();
        for (int age : ages ) {
            System.out.println("Age is " + age  );
        }
    }

    // Illustrates use of break. If one unit passed (a score greater than passmark
    // has been found) the loop is not executed any more.
    static void checkPassUnit() {
        int passmark = 8;
        boolean passed = false;
        int[] score = { 4, 6, 2, 8, 12, 34, 9 };

        for (int unit : score ) {
            if (unit > passmark) {
                passed = true;
                break;
            }
        }
        System.out.println("One or more units passed? " + passed);
    }

    // Illustrates use of contine. When a unit passed is found (a score greater than passmark
    // has been found) the remainder of the loop is not checked. Instead the number of passes
    // still required is decremented and the loop starts again.
    static void checkPassNUnits() {
        int passMark = 15;
        int passesReqd = 3;
        int[] score = { 4, 6, 2, 8, 12, 34, 9 };

        for (int unit : score ) {

            if ( unit < passMark) {
                continue;
            }
            passesReqd--;
        }
        System.out.println("Number of units still reqd " + Math.max(0,passesReqd));
    }

}
