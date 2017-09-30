import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

        ArabicToRomanHandler handler = new ArabicToRomanHandler();
        romanNumber.addActionListener(handler);

    }

    /**
     * http://bcbutler.com/Java_Tuts/java_roman_numeral_converter_GUI.php
     * @param romanNumber
     * @return
     */
    private int romanToArabic(String romanNumber) {
        int arabicNumber = 0;
        int length = romanNumber.length();
        int currentLetter = 0;
        int nextLetter = 0;

        while (currentLetter <= length) {
            char letter = romanNumber.charAt(currentLetter);
            int number = letterToNumber(letter);
            currentLetter++;
            if (currentLetter == length) {
                arabicNumber += number;
            } else {
                nextLetter = letterToNumber(romanNumber.charAt(currentLetter));
                if (nextLetter > currentLetter) {
                    arabicNumber += (nextLetter - currentLetter);
                    currentLetter++;
                } else {
                    arabicNumber += currentLetter;
                }
            }
        }
        return arabicNumber;
    }

    /**
     * http://bcbutler.com/Java_Tuts/java_roman_numeral_converter_GUI.php
     * @param letter
     * @return
     */
    private int letterToNumber(char letter) {
        switch(letter)  {
            case 'I':
                return 1;
            case 'V':
                return  5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    private class ArabicToRomanHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == romanNumber)

        }


    }

}
