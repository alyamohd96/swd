import javax.swing.*;
import java.awt.*;

public class PrintingTree extends JPanel {

    private TreeNode currentNode;
    private int xCoordinate;
    private int yCoordinate;

    public PrintingTree(TreeNode currentNode,int xCoordinate, int yCoordinate)    {
        this.currentNode = currentNode;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void paintComponent(Graphics g)  {
        if(currentNode == null) {
            return;
        }
        g.drawString(currentNode.data+"",xCoordinate,yCoordinate);
        if(currentNode.leftNode != null)    {
            int leftXCoordinate = xCoordinate - 100;
            int leftYCoordinate = yCoordinate + 100;
            g.drawLine(xCoordinate,yCoordinate,leftXCoordinate,leftYCoordinate);
            currentNode = currentNode.leftNode;
            xCoordinate = leftXCoordinate;
            yCoordinate = leftYCoordinate;
            //paintComponent(currentNode.leftNode,leftXCoordinate,leftYCoordinate,g);
        }
        else if(currentNode.rightNode != null)  {
            int rightXCoordinate = xCoordinate + 100;
            int rightYCoordinate = yCoordinate + 100;
            g.drawLine(xCoordinate,yCoordinate,rightXCoordinate,rightYCoordinate);
            currentNode = currentNode.rightNode;
            xCoordinate = rightXCoordinate;
            yCoordinate = rightYCoordinate;
            //drawTree(currentNode.rightNode,rightXCoordinate,rightYCoordinate,g);
        }
    }
}
