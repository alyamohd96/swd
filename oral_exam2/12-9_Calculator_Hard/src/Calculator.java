public class Calculator {

    private double num1;
    private double num2;
    private String operation;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getOperation(String operation)   {
        switch (operation)  {
            case "+":
                return 1;
            case "-":
                return 2;
            case "X":
                return 3;
            case "/":
                return 4;
            default:
                return -1;
        }
    }


    public void calculate() {
        int operation = getOperation(this.operation);
        switch (operation)  {
            case 1:
                this.num1 = this.num1 + this.num2;
            case 2:
                this.num1 = this.num1 - this.num2;
            case 3:
                this.num1 = this.num1 * this.num2;
            case 4:
                //TODO CREATE EXCEPTION FOR DIVIDE BY 0 OPERATION
                if(this.num2 == 0)
                    this.num1 = 0;
                else
                    this.num1 = this.num1 / this.num2;
        }
    }

    //TODO Find method to convert double to String
    @Override
    public String toString()    {

    }

}
