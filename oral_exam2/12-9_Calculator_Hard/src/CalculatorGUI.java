import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {

    private final JTextField input;

    private final JButton num1;
    private final JButton num2;
    private final JButton num3;
    private final JButton num4;
    private final JButton num5;
    private final JButton num6;
    private final JButton num7;
    private final JButton num8;
    private final JButton num9;
    private final JButton num0;

    private final JButton divide;
    private final JButton multiply;
    private final JButton subtract;
    private final JButton add;
    private final JButton equal;
    private final JButton decimal;

    private final Font defaultFont;

    public CalculatorGUI()  {
        super("Calculator");
        setLayout(new GridLayout(5,5));
        defaultFont = new Font("Trebuchet MS", Font.PLAIN, 30);

        input = new JTextField("0");

        num1 = new JButton("1");


    }


}
