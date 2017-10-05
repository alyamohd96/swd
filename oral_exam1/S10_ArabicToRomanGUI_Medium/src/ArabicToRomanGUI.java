/**
 * This ArabicToRomanGUI class is the GUI component of the HangmanGUI program.
 * The class inherits the JFrame class to construct the GUI. The class also
 * has an private inner class for handling events.
 */

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

    /**
     * The constructor for the class. The constructor adds the JLabel
     * and the JTextField to the JFrame.
     */
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
     * This function converts the roman numerals to the arabic numerals.
     * The function is taken from the following website:
     * http://math.hws.edu/eck/cs124/javanotes3/c9/ex-9-3-answer.html
     * @param roman the roman numberal to be converted
     * @return the number in arabic
     */
    private int romanToArabic(String roman) {
        int i = 0;       // A position in the string, roman;
        int arabic = 0;  // Arabic numeral equivalent of the part of the string that has
        //    been converted so far.

        while (i < roman.length()) {
            char letter = roman.charAt(i);          // Letter at current position in string.
            int number = letterToNumber(letter);    // Numerical equivalent of letter.
            i++;                                    // Move on to next position in the string

            if (i == roman.length()) {
                // There is no letter in the string following the one we have just processed.
                // So just add the number corresponding to the single letter to arabic.
                arabic += number;
            }
            else {
                // Look at the next letter in the string.  If it has a larger Roman numeral
                // equivalent than number, then the two letters are counted together as
                // a Roman numeral with value (nextNumber - number).
                int nextNumber = letterToNumber(roman.charAt(i));
                if (nextNumber > number) {
                    // Combine the two letters to get one value, and move on to next position in string.
                    arabic += (nextNumber - number);
                    i++;
                }
                else if(nextNumber<0) {
                    arabic = -1;
                }
                else    {
                    // Don't combine the letters.  Just add the value of the one letter onto the number.
                    arabic += number;
                }
            }
        }  // end while
        return arabic;
    }

    /**
     * This function finds the number that corresponds to the roman numeral.
     * It is taken from this website:
     * http://bcbutler.com/Java_Tuts/java_roman_numeral_converter_GUI.php
     * @param letter the roman letter
     * @return the number in arabic
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

    /**
     * This inner class is the handler class for this GUI. The class
     * is a private class that implements the interface ActionListener
     */
    private class ArabicToRomanHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String romanToConvert = new String();
            if(event.getSource() == romanNumber)
                romanToConvert = romanNumber.getText();
                int arabic = romanToArabic(romanToConvert);
                if(arabic>0) {
                    String arabicNumString = Integer.toString(arabic);
                    arabicNumber.setText(arabicNumString);
                }
                else    {
                    arabicNumber.setText("Invalid Input");
                }
        }
    }



}
