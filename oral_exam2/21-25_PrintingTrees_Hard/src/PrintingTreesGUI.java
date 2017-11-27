import javax.swing.*;
import java.awt.*;

public class PrintingTreesGUI extends JPanel{

    private Tree<Integer> tree;

    public PrintingTreesGUI(Tree<Integer> tree)   {
        this.tree = tree;
    }

    @Override
    public void paintComponent(Graphics g)  {
        tree.drawStructure(g);
    }

}
