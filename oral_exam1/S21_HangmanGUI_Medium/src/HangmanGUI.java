import javax.swing.*;
import java.awt.*;

public class HangmanGUI extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JPasswordField secretWord;

    public HangmanGUI() {
        super("Hangman");
        setLayout(new FlowLayout());    //set frame layout

        label1 = new JLabel("Welcome to Hangman");
        label2 = new JLabel("Insert secret word:");
        secretWord = new JPasswordField(30);

        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.TOP);
        add(label1);

        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        add(label2);

        add(secretWord);
    }
}
