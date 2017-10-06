import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This ArabicToRomanGUI class is the GUI component of the HangmanGUI program.
 * The class inherits the JFrame class to construct the GUI. The class also
 * has an private inner class for handling events.
 */
public class ArabicToRomanGUI extends JFrame {

    /**
     * label1 is an instance variable of type JLabel that will say "Roman Number"
     */
    private final JLabel label1;
    /**
     * label2 is an instance variable of type JLabel that will say "Arabic Number"
     */
    private final JLabel label2;
    /**
     * romanNumber is an instance variable of type JTextField. The roman number to be converted
     * or the roman number after conversion will appear here
     */
    private final JTextField romanNumber;
    /**
     * arabicNumber is an instance variable of type JTextField that will be where the arabic number
     * be placed.
     */
    private final JTextField arabicNumber;
    /**
     * defaultFont is an instance variable of type Font that store the preffered font
     * which is Trebuchet MS of size 30
     */
    private final Font defaultFont;

    /**
     * The constructor for the class. The constructor adds the JLabel
     * and the JTextField to the JFrame. It will also add an ActionHandler
     * to the actionListener of the arabicNumber and romanNumber JTextField
     */
    public ArabicToRomanGUI()   {
        super("Arabic To Roman");
        setLayout(new GridLayout(2,2));
        defaultFont = new Font("Trebuchet MS", Font.PLAIN, 30);

        label1 = new JLabel("Roman Number:");
        label1.setFont(defaultFont);
        add(label1);

        romanNumber = new JTextField();
        romanNumber.setFont(defaultFont);
        add(romanNumber);

        label2 = new JLabel("Arabic Number:");
        label2.setFont(defaultFont);
        add(label2);
        arabicNumber = new JTextField();
        arabicNumber.setFont(defaultFont);
        add(arabicNumber);

        ArabicToRomanHandler handler = new ArabicToRomanHandler();

        romanNumber.addActionListener(handler);
        arabicNumber.addActionListener(handler);
    }

    /**
     * This function converts the roman numerals to the arabic numerals.
     * The function is taken from the following website:
     * http://math.hws.edu/eck/cs124/javanotes3/c9/ex-9-3-answer.html
     * with some only a line of code changed
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
     * This function is taken from this website:
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
     * This method converts integer to roman numeral. It will also check whether
     * the input is less than 1 and greater than 3999 as the roman numeral
     * is only valid between 1 and 3999
     * @param input arabic number to be converted to roman
     * @return a String that contains the roman numeral
     */
    public static String IntegerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }

    /**
     * This method checks whether the roman numeral to be converted is valid or not.
     * This method is taken from the following website:
     * https://stackoverflow.com/questions/267399/how-do-you-match-only-valid-roman-numerals-with-a-regular-expression
     * @param roman the roman numeral to be checked
     * @return true if the roman numeral is valid. false if not
     */
    private boolean checkValidityRoman(String roman)    {
        return roman.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }


    /**
     * This inner class is the handler class for this GUI. The class
     * is a private class that implements the interface ActionListener
     * and calls the appropriate methods to convert the numbers. It will also
     * display the result to the appropriate JTextField
     */
    private class ArabicToRomanHandler implements ActionListener {

        /**
         * This method is the Overridden method from the ActionListener.
         * It decides what to do when an action is performed from the
         * arabicNumber JTextField and the romanNumber JTextField
         * @param event
         */
        @Override
        public void actionPerformed(ActionEvent event) {
            String romanToConvert = new String();
            String temp;
            int arabicToConvert;
            if(event.getSource() == romanNumber) {
                if(checkValidityRoman(romanNumber.getText()))   {
                    romanToConvert = romanNumber.getText();
                    int arabic = romanToArabic(romanToConvert);
                    if (arabic > 0) {
                        String arabicNumString = Integer.toString(arabic);
                        arabicNumber.setText(arabicNumString);
                    } else {
                        arabicNumber.setText("Invalid Input");
                    }
                }
                else {
                    arabicNumber.setText("Invalid Input roman numeral wrong");
                }
            }
            else if (event.getSource() == arabicNumber) {
                temp = arabicNumber.getText();
                if( temp.matches("[-+]?\\d*\\.?\\d+") )    {
                    arabicToConvert = Integer.parseInt(temp);
                    String roman = IntegerToRomanNumeral(arabicToConvert);
                    romanNumber.setText(roman);
                }
                else    {
                    romanNumber.setText("Invalid input");
                }

            }
        }
    }


}
