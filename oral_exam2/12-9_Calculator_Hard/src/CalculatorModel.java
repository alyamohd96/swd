//TODO have to check how this is going to work because it is not working for now.
public class CalculatorModel {

    private double number1;
    private double number2;
    //private String operator;

    /*public CalculatorModel(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }*/

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public static double calculate(double number1, double number2, String operator)  {
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
