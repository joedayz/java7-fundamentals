
public class LoopExamples {
    public static void main (String args[]) {

        // uncomment the example you want to use
        //sqroot();
        //doubleYourMoney();
        //counterLoop();
        //counterLoop2();

    }

    // Find square root using successive approximation
    public static void sqroot() {
        float square = 4;    // number to find sq root of
        float squareRoot = square;    // first "guess"
        while (squareRoot * squareRoot - square > 0.001) { // How accurate?
            squareRoot = (squareRoot + square/squareRoot)/2;
            System.out.println("Next try will be " + squareRoot);
        }
        System.out.println("The square root of " + square + " is " + squareRoot);
    }

    // Check compound interest returns over period of time
    public static void doubleYourMoney() {
        int initialSum = 500;
        int interest = 7;         // per cent
        int years = 0;
        int currentSum = initialSum * 100; // Convert to pennies
        while (currentSum <= 100000) {
            currentSum += currentSum * interest/100;
            years++;
            System.out.println("Year " + years + ": " + currentSum/100);
        }
    }

    // Simple for loop
    public static void counterLoop() {
        // Simple loop to print out a comment block
        System.out.println("   /*");
        //int counter = 0;
        for (int counter = 0; counter < 4; counter++ ) {
            System.out.println("    *");
        }
        System.out.println("    */");
    }

    // More complex for loop
    public static void counterLoop2() {
        for (String i = "|", t = "------"; i.length() < 7 ; i+="|", t = t.substring(1)) {
            System.out.println(i + t);
        }
    }
}
