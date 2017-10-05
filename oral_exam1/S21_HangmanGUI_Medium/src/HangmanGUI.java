/**
 * This HangmanGUI class is the class
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HangmanGUI extends JFrame {

    //instance variables for the GUI
    private final JLabel label1;
    private final JLabel label2;
    private final JPasswordField secretWord;
    private final JLabel label3;
    private final JTextField textField1;
    private final JLabel label4;
    private final JTextField textField2;
    private final Font defaultFont;
    private final JLabel label5;
    private final JLabel label6;
    private final JLabel label7;


    public HangmanGUI() {
        super("Hangman");
        setLayout(new GridLayout(10,1));    //set frame layout
        defaultFont = new Font("Trebuchet MS", Font.PLAIN, 30);

        label1 = new JLabel("Welcome to Hangman!");
        label5 = new JLabel("Secret word will be displayed here");
        label2 = new JLabel("Insert secret word:");
        secretWord = new JPasswordField(30);
        label3 = new JLabel("Enter your guess here:");
        textField1 = new JTextField();
        label4 = new JLabel("Number of guesses left:");
        textField2 = new JTextField();
        label6 = new JLabel("Letters guessed:");
        label7 = new JLabel();

        //Welcome To Hangman Label
        label1.setVerticalAlignment(SwingConstants.CENTER);
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
        add(label1);

        //Secret word will be displayed here Label
        label5.setVerticalAlignment(SwingConstants.CENTER);
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
        add(label5);

        //Insert secret word Label
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setFont(defaultFont);
        add(label2);

        //secret word JPasswordField
        secretWord.setFont(defaultFont);
        add(secretWord);

        //Enter your guess here Label
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setVerticalAlignment(SwingConstants.CENTER);
        label3.setFont(defaultFont);
        add(label3);

        //Text field to insert guess
        textField1.setHorizontalAlignment(SwingConstants.LEFT);
        textField1.setFont(defaultFont);
        add(textField1);

        label6.setHorizontalAlignment(SwingConstants.LEFT);
        label6.setVerticalAlignment(SwingConstants.CENTER);
        label6.setFont(defaultFont);
        add(label6);

        label7.setHorizontalAlignment(SwingConstants.LEFT);
        label7.setVerticalAlignment(SwingConstants.CENTER);
        label7.setFont(defaultFont);
        add(label7);

        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setVerticalAlignment(SwingConstants.CENTER);
        label4.setFont(defaultFont);
        add(label4);

        textField2.setHorizontalAlignment(SwingConstants.LEFT);
        textField2.setFont(defaultFont);
        textField2.setEditable(false);
        add(textField2);

        HangmanHandler handler = new HangmanHandler();
        textField1.addKeyListener(handler);
        secretWord.addActionListener(
                //anonymous inner class for secretWord JTextField
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        secretWord.setEditable(false);
                        wordToBeGuessed = new String();
                        wordToBeGuessed = secretWord.getText();
                        wordToBeGuessed = wordToBeGuessed.toUpperCase();
                        output = new char[wordToBeGuessed.length()];
                        lettersGuessed = new char[6];

                        for(int i = 0; i < wordToBeGuessed.length();i++)
                            output[i] = '*';

                        numOfGuessesLeft = 6;
                        exposed = 0;

                        label5.setText(outputString(output));
                        textField2.setText(Integer.toString(numOfGuessesLeft));
                    }
                }
        );


    }


    private String outputString(char[] output)   {
        String outputInString = new String(output);
        return outputInString;
    }

    private class HangmanHandler extends KeyAdapter{
        @Override
        public void keyTyped(KeyEvent e) {




            /*
            //super.keyTyped(e);
            numOfGuessesLeft++;
            char inputLetter = e.getKeyChar();
            lettersGuessed[exposed] = inputLetter;
            label7.setText(String.valueOf(lettersGuessed[exposed]));
            if(numOfGuessesLeft != 0) {
                for (int i = 0; i < wordToBeGuessed.length(); i++) {
                    if ((inputLetter == wordToBeGuessed.charAt(i)) && (output[i] == '*'))
                        output[i] = wordToBeGuessed.charAt(i);
                    exposed++;
                }
                label5.setText(outputString(output));
            }
            else {
                if (exposed == output.length) {
                    JOptionPane.showMessageDialog(HangmanGUI.this, String.format("You win!"));
                } else {
                    JOptionPane.showMessageDialog(HangmanGUI.this, String.format("You lose!"));
                }
            }*/
        }
    }
}
