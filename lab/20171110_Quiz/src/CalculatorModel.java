public class CalculatorModel {

    private double num1;
    private double num2;
    private String operator;
    private String result;

    public CalculatorModel(double num1, double num2, String operator)    {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
        this.result = "0";
    }

    public double calculate()   {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    result = "Cannot be divided by 0";
                    return 0;
                }
                else    {
                return num1 / num2;
                }
        }

        System.out.println("Unknown operator - " + operator);
        return 0;
    }

}
