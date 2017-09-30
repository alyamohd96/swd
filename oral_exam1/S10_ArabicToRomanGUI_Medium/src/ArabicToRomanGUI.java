import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArabicToRomanGUI extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JTextField romanNumber;
    private final JTextField arabicNumber;
    private final Font defaultFont;

    public ArabicToRomanGUI()   {
        super("Arabic To Roman");
        setLayout(new GridLayout(2,2));

        defaultFont = new Font("Trebuchet MS", Font.PLAIN, 30);

        label1 = new JLabel("Roman Number:");
        label1.setFont(defaultFont);
        add(label1);
        romanNumber = new JTextField("Insert here",30);
        romanNumber.setFont(defaultFont);
        add(romanNumber);

        label2 = new JLabel("Arabic Number:");
        label2.setFont(defaultFont);
        add(label2);
        arabicNumber = new JTextField(30);
        arabicNumber.setFont(defaultFont);
        add(arabicNumber);

        //ArabicToRomanHandler handler = new ArabicToRomanHandler();
        //romanNumber.addActionListener(handler);

    }


    private int RomanToArabic(int romanNumber)  {

    }

    private class ArabicToRomanHandler implements ActionListener  {

        @Override
        public void actionPerformed(ActionEvent event)  {
            if(event.getSource() == romanNumber)

        }

    }

}
