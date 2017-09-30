import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanGUI extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JPasswordField secretWord;
    private final JLabel label3;
    private final JLabel label4;
    private final Font defaultFont;

    public HangmanGUI() {
        super("Hangman");
        setLayout(new GridLayout(8,1));    //set frame layout
        defaultFont = new Font("Trebuchet MS", Font.PLAIN, 30);

        label1 = new JLabel("Welcome to Hangman!");
        label2 = new JLabel("Insert secret word:");
        secretWord = new JPasswordField(30);
        label3 = new JLabel("Enter your guess by letter here:");
        label4 = new JLabel("Number of guesses left:");

        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.TOP);
        label1.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
        add(label1);

        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setFont(defaultFont);
        add(label2);

        secretWord.setFont(defaultFont);
        add(secretWord);

        HangmanHandler handler = new HangmanHandler();
        secretWord.addActionListener(handler);
    }


    private class HangmanHandler implements ActionListener  {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
