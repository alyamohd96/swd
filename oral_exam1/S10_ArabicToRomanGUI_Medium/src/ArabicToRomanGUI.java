/**
 * This ArabicToRomanGUI class is the GUI component of the HangmanGUI program.
 * The class inherits the JFrame class to construct the GUI. The class also
 * has an private inner class for handling events.
 */

import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
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
     * https://stackoverflow.com/questions/267399/how-do-you-match-only-valid-roman-numerals-with-a-regular-expression
     * @param roman
     * @return
     */
    private boolean checkValidityRoman(String roman)    {
        return roman.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    /**
     * This inner class is the handler class for this GUI. The class
     * is a private class that implements the interface ActionListener
     */
    private class ArabicToRomanHandler implements ActionListener {

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
