import javax.swing.*;
import java.awt.*;

public class HangmanFigure extends JPanel {

    private int bodyParts = 6;

    public HangmanFigure()  {

    }

    public int getBodyParts() {
        return bodyParts;
    }

    public void setBodyParts(int bodyParts) {
        this.bodyParts = bodyParts;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawLine(5, 5, 290, 5);
        g.drawLine(5, 1000, 5, 5);
        g.drawLine(290, 5, 290, 20);
        if (this.bodyParts == 5)    { ;
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