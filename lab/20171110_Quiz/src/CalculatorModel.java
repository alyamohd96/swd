public class CalculatorModel {


    public double calculate(double number1, double number2, String operator)  {
        switch (operator) {
            case "+":
                return number1 + number2;

            case "-":

                return number1 - number2;

            case "*":

                return number1 * number2;

            case "/":
                if (number2 == 0) {
                    return 0;
                }
                else {
                    return number1 / number2;
                }
        }
        return 0;
    }

}
