import java.util.Scanner;

public class MaxFinderDriver {

    public static void main(String[] args) {
        // create Scanner for input from command window
        Scanner input = new Scanner(System.in);

        // prompt for and input three floating-point values
        System.out.print(
                "Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double

        // determine the maximum value
        double result = MaximumFinder.maximum(number1, number2, number3);

        // display maximum value
        System.out.println("Maximum is: " + result);
    }
}
