import javax.swing.*;

public class CalculatorDriverClass {

    public static void main(String args[]) {

        CalculatorGUI calculatorGUI = new CalculatorGUI();
        calculatorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorGUI.setSize(600,400);
        calculatorGUI.setVisible(true);
    }
}
