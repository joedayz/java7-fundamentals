
public class CalculatorTest {

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        int totalOne = myCalculator.sum(2, 3);
        System.out.println(totalOne);

        float totalTwo = myCalculator.sum(15.99F, 12.85F);
        System.out.println(totalTwo);

        float totalThree = myCalculator.sum(2, 12.85F);
        System.out.println(totalThree);
    }
}

