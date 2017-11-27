import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class PrintingTreesGUI extends JFrame{

    public PrintingTreesGUI()   {
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("Inserting the following values: ");

        // insert 10 random integers from 0-99 in tree
        for (int i = 1; i <= 10; i++) {
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        tree.drawTree();
    }
}
