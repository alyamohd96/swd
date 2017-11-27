// Fig. 21.18: TreeTest.java
// Binary tree test program.

import javax.swing.*;
import java.security.SecureRandom;

public class TreeTest extends JFrame{
    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("Inserting the following values: ");

        // insert 10 random integers from 0-99 in tree
        for (int i = 1; i <= 10; i++) {
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        tree.outputTree();

        JFrame treesGUI = new JFrame();
        treesGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        treesGUI.setSize(1000,1000);
        treesGUI.setVisible(true);

        treesGUI.add(new PrintingTreesGUI(tree));

    }
} // end class TreeTest

