import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArabicToRomanGUI extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JTextField romanNumber;
    private final JTextField arabicNumber;

    public ArabicToRomanGUI()   {
        super("Arabic To Roman");
        setLayout(new FlowLayout());

        label1 = new JLabel("Roman Number:");
        add(label1);
        romanNumber = new JTextField("Insert here",30);
        add(romanNumber);

        label2 = new JLabel("Arabic Number:");
        add(label2);
        arabicNumber = new JTextField(30);
        add(arabicNumber);

        ArabicToRomanHandler handler = new ArabicToRomanHandler();

    }

    private class ArabicRomanHandler implements ActionListener  {

        @Override
        public void actionPerformed(ActionEvent event)  {

        }

    }

}
