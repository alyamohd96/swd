import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        //TODO: FIND CODE FOR LAYOUT BASED ON THE CALCULATORgui
        setLayout(new GridLayout(3,3));


        defaultFont = new Font("Trebuchet MS", Font.PLAIN, 60);

        input = new JTextField("0");
        add(input);

        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        num0 = new JButton("0");
        divide = new JButton("/");
        multiply = new JButton("X");
        subtract = new JButton("-");
        add = new JButton("+");
        equal = new JButton("=");
        decimal = new JButton(".");

        //added all the JButtons in the Frame
        add(num1);
        add(num2);
        add(num3);
        add(num4);
        add(num5);
        add(num6);
        add(num7);
        add(num8);
        add(num9);
        add(num0);
        add(divide);
        add(multiply);
        add(subtract);
        add(add);
        add(equal);
        add(decimal);

        //add event listener to all buttons
        equal.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                }
        );


    }

}
