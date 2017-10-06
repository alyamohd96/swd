/**
 * This HangmanGUI class is the class
 */

import jdk.nashorn.internal.scripts.JO;

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

    private final HangmanFigure hangmanFigure;

    //
    private Hangman hangman1;


    public HangmanGUI(){
        super("Hangman");
        setLayout(new GridLayout(5,5));    //set frame layout
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

        add(new JLabel(""));

        hangmanFigure = new HangmanFigure();
        hangmanFigure.setSize(600,1000);
        hangmanFigure.setAlignmentX(CENTER_ALIGNMENT);
        add(hangmanFigure);

        //Insert secret word Label
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setFont(defaultFont);
        add(label2);

        //secret word JPasswordField
        secretWord.setFont(defaultFont);
        add(secretWord);

        add(new JLabel(""));

        //Enter your guess here Label
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setVerticalAlignment(SwingConstants.CENTER);
        label3.setFont(defaultFont);
        add(label3);

        //Text field to insert guess
        textField1.setHorizontalAlignment(SwingConstants.LEFT);
        textField1.setFont(defaultFont);
        add(textField1);

        add(new JLabel(""));

        label6.setHorizontalAlignment(SwingConstants.LEFT);
        label6.setVerticalAlignment(SwingConstants.CENTER);
        label6.setFont(defaultFont);
        add(label6);

        label7.setHorizontalAlignment(SwingConstants.LEFT);
        label7.setVerticalAlignment(SwingConstants.CENTER);
        label7.setFont(defaultFont);
        add(label7);

        add(new JLabel(""));

        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setVerticalAlignment(SwingConstants.CENTER);
        label4.setFont(defaultFont);
        add(label4);

        textField2.setHorizontalAlignment(SwingConstants.LEFT);
        textField2.setFont(defaultFont);
        textField2.setEditable(false);
        add(textField2);

        hangmanFigure.repaint();

        secretWord.addActionListener(
                //anonymous inner class for secretWord JTextField
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        secretWord.setEditable(false);
                        String secret = secretWord.getText().toUpperCase();
                        hangman1 = new Hangman(secret);
                        label5.setText(hangman1.getOutput().toString());
                        textField2.setText(Integer.toString(hangman1.getBodyparts()));
                        hangmanFigure.repaint();
                    }
                }
        );

        HangmanHandler handler = new HangmanHandler();
        textField1.addActionListener(handler);

    }

    private String outputString(char[] output)   {
        String outputInString = new String(output);
        return outputInString;
    }


    private class HangmanHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String input = textField1.getText();
            input = input.toUpperCase();

            if(!hangman1.isDone()) {
                hangman1.startHangman(input);
                label7.setText(hangman1.getGuesses());
                textField2.setText(Integer.toString(hangman1.getBodyparts()));
                hangmanFigure.setBodyParts(hangman1.getBodyparts());
                hangmanFigure.repaint();
                label5.setText(hangman1.getOutput().toString());
                if (hangman1.isWin()) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                }
            }
            else    {
                if (hangman1.isWin()) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "You lose!");
                }

            }


        }




    }
}
