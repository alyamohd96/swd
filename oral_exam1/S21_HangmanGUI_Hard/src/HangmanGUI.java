
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This HangmanGUI class is the class that creates the game's interface
 * This class extends JFrame class and has an anonymous inner class and
 * an inner class for the action event handling component.
 */
public class HangmanGUI extends JFrame {

    /**
     * label1 is the Welcome to Hangman! label
     */
    private final JLabel label1;
    /**
     * label2 is the Insert secret word:
     */
    private final JLabel label2;
    /**
     * secretWord is where the user will input the secret word that will guessed
     */
    private final JPasswordField secretWord;
    /**
     * label3 is the Enter your guess here: label
     */
    private final JLabel label3;
    /**
     * textfield1 is the text field where the user will input their guess
     */
    private final JTextField textField1;
    /**
     * label4 is the Number of guesses left: label
     */
    private final JLabel label4;
    /**
     * textfield2 will display the number of guesses left by the user
     */
    private final JTextField textField2;
    /**
     * defaultFont is the font for all the components in the JFrame.
     * The variable will be set to Trebuchet MS if size 30
     */
    private final Font defaultFont;
    /**
     * label5 is the Secret word will be displayed here label
     */
    private final JLabel label5;
    /**
     * label6 is the Letters guessed: label
     */
    private final JLabel label6;
    /**
     * label7 will show the letters guessed by the user
     */
    private final JLabel label7;

    /**
     * hangmanFigure is an instance variable of type HangmanFigure
     * that generates the hangman figure
     */
    private final HangmanFigure hangmanFigure;

    /**
     * hangman1 is an instance variable of type Hangman that
     * contains the basic methods for the hangman game
     */
    private Hangman hangman1;


    /**
     * This no argument constructor for this class will instantiate the
     * instance variables and add them to the JFrame. The layout of the
     * JFrame is the GridLayout of 5 rows and 5 columns This constructor
     * will also instantiate a action handler for the textfields and labels
     */
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

        //empty JLabel added to the JFrame to leave one grid empty
        add(new JLabel(""));

        //instantiate the hangman figure
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

        //empty JLabel added to the JFrame to leave one grid empty
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

        //empty JLabel added to the JFrame to leave one grid empty
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

                    /**
                     * This anonymous inner class for secretWord makes the textfield1 uneditable
                     * after the secret word has entered and instantiates the hangman game. it
                     * will also changes the input from the user to uppercase for simplicity
                     * @param e
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        //instantiate the hangman object and checks the input for validity
                        secretWord.setEditable(false);
                        String secret = secretWord.getText().toUpperCase();
                        if(!secret.isEmpty() || isAlpha(secret)) {
                            hangman1 = new Hangman(secret);
                            label5.setText(hangman1.getOutput().toString());
                            textField2.setText(Integer.toString(hangman1.getBodyparts()));
                            hangmanFigure.repaint();
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Invalid input!");
                    }
                }
        );

        //instantiate a new HangmanHandler and binds it to textfield1
        HangmanHandler handler = new HangmanHandler();
        textField1.addActionListener(handler);
    }


    /**
     * This method validate the message to contain only
     * alphabets.
     * @param check
     * @return true if contain only alphabets and spaces.
     *          false if contain besides alphabets
     */
    public static boolean isAlpha(String check) {
        char[] chars = check.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && !(c == ' ')) {
                return false;
            }
        }
        return true;
    }


    /**
     * this private inner class is the class that handles any action
     * event performed by textfield1. it implements the ActionListener class
     * and Overrides the actionPerformed methods.
     */
    private class HangmanHandler implements ActionListener {

        /**
         * This method is the overriden method from ActionListener.
         * When an action event occurs from textfield1, the method
         * will call the startHangman method from the Hangman object, hangman1.
         * When the games ends, a JOptionPane window will be displayed indicating
         * the player whether they have lost or won
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            String input = textField1.getText();
            input = input.toUpperCase();

            if (isAlpha(input)) {

                if (!hangman1.isDone()) {
                    hangman1.startHangman(input);
                    label7.setText(hangman1.getGuesses());
                    textField2.setText(Integer.toString(hangman1.getBodyparts()));
                    hangmanFigure.setBodyParts(hangman1.getBodyparts());
                    hangmanFigure.repaint();
                    label5.setText(hangman1.getOutput().toString());
                    if (hangman1.isWin()) {
                        JOptionPane.showMessageDialog(null, "You Win!");
                    }
                } else {
                    if (hangman1.isWin()) {
                        JOptionPane.showMessageDialog(null, "You Win!");
                    } else {
                        JOptionPane.showMessageDialog(null, "You lose!");
                    }

                }

            }
        }




    }
}
