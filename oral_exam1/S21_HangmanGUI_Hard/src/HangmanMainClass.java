import javax.swing.JFrame;

/**
 * This is the driver class for the HangmanGUI. It instantiates
 * the HangmanGUI and set the settings of the JFrame. The
 * close button on the JFrame will exit when the close button
 * is pressed. It will also set the size of JFrame to 2000X2000
 */
public class HangmanMainClass {

    public static void main(String[] args)  {
        HangmanGUI session1 = new HangmanGUI();
        session1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        session1.setSize(2000,2000);
        session1.setVisible(true);
    }
}
