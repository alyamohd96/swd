import javax.swing.JFrame;

public class HangmanMainClass {

    public static void main(String[] args)  {
        HangmanGUI session1 = new HangmanGUI();
        session1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        session1.setSize(800,1000);
        session1.setVisible(true);
    }
}
