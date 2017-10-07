import javax.swing.*;
import java.awt.*;

/**
 * This class generates the hangman figure for the HangmanGUI
 * This class extends from the JPanel class. It has one private instance
 * variable and three methods.
 */
public class HangmanFigure extends JPanel {

    /**
     * this private int instance variable store the number of
     * bodyparts left. the default value of this variable is 6
     */
    private int bodyParts = 6;

    /**
     * This is a no argument constructor for the class
     */
    public HangmanFigure()  {

    }

    /**
     * this is an accessor method for the instance variable bodyparts.
     * @return the value of bodyparts in type int
     */
    public int getBodyParts() {
        return bodyParts;
    }

    /**
     * this is a mutator method for the instance variable bodyparts.
     * @param bodyParts the number of bodyparts left for the hangman
     */
    public void setBodyParts(int bodyParts) {
        this.bodyParts = bodyParts;
    }

    /**
     * This overridden method is for generating the hangman figure. The
     * method will generate the bodyparts of the hangman one by one as
     * the number of bodyparts decreases.
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        g.drawLine(5, 5, 290, 5);
        g.drawLine(5, 1000, 5, 5);
        g.drawLine(290, 5, 290, 20);
        if (this.bodyParts == 5)    {
            g.drawOval(240, 15, 90, 90);
        }
        else if (this.bodyParts == 4)   {
            g.drawOval(240, 15, 90, 90);
            g.drawLine(290, 105, 290, 305);
        }
        else if (this.bodyParts == 3) {
            g.drawOval(240, 15, 90, 90);
            g.drawLine(290, 105, 290, 305);
            g.drawLine(290, 120, 360, 200);
        }
        else if (this.bodyParts == 2) {
            g.drawOval(240, 15, 90, 90);
            g.drawLine(290, 105, 290, 305);
            g.drawLine(290, 120, 360, 200);
            g.drawLine(290, 120, 220, 200);
        }
        else if (this.bodyParts == 1) {
            g.drawOval(240, 15, 90, 90);
            g.drawLine(290, 105, 290, 305);
            g.drawLine(290, 120, 360, 200);
            g.drawLine(290, 120, 220, 200);
            g.drawLine(290, 305, 360, 385);
        }
        else if (this.bodyParts == 0) {
            g.drawOval(240, 15, 90, 90);
            g.drawLine(290, 105, 290, 305);
            g.drawLine(290, 120, 360, 200);
            g.drawLine(290, 120, 220, 200);
            g.drawLine(290, 305, 360, 385);
            g.drawLine(290, 305, 220, 385);
        }

    }
}