public class CalculatorModel {

    private double num1;
    private double num2;
    private double result;
    private String display = "0";

    public CalculatorModel()    {
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public String getDisplay() {
        return display;
    }

    public double calculate(String operator)   {
        switch (operator) {
            case "+":
                result = num1 + num2;
                display = Double.toString(result);
                return result;
            case "-":
                result = num1 - num2;
                display = Double.toString(result);
                return result;
            case "*":
                result = num1 * num2;
                display = Double.toString(result);
                return result;
            case "/":
                if (num2 == 0) {
                    display = "Cannot be divided by 0";
                    result = 0;
                    return result;
                }
                else    {
                    result = num1 / num2;
                    display = Double.toString(result);
                    return result;
                }
            case "=":
                display = Double.toString(result);
        }
        return 0;
    }

    public void clear() {
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
        this.display = "0";
    }

}
