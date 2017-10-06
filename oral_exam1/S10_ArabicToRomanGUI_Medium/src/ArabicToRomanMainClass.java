import javax.swing.*;

/**
 * This is the driver class for the ArabicToRomanGUI. It instantiates the
 * ArabicToRomanGUI and sets the settings for the JFrame.
 */
public class ArabicToRomanMainClass {


    public static void main(String[] args)  {

        /**
         * An ArabicToRomanGUI is instantiated called session1. The GUI will
         * run and the size of the JFrame will be 600x400. It will also exit
         * when the close operation is pressed.
         */
        ArabicToRomanGUI session1 = new ArabicToRomanGUI();
        session1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        session1.setSize(600,400);
        session1.setVisible(true);
    }
}
