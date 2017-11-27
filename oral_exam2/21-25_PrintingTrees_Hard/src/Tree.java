// Fig. 21.17: Tree.java
// TreeNode and Tree class declarations for a binary search tree.

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;

// class TreeNode definition
class TreeNode<T extends Comparable<T>> {
    // package access members
    TreeNode<T> leftNode;
    T data; // node value
    TreeNode<T> rightNode;

    // constructor initializes data and makes this a leaf node
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    }

    // locate insertion point and insert new node; ignore duplicate values
    public void insert(T insertValue) {
        // insert in left subtree
        if (insertValue.compareTo(data) < 0) {
            // insert new TreeNode
            if (leftNode == null)
                leftNode = new TreeNode<T>(insertValue);
            else // continue traversing left subtree recursively
                leftNode.insert(insertValue);
        }
        // insert in right subtree
        else if (insertValue.compareTo(data) > 0) {
            // insert new TreeNode
            if (rightNode == null)
                rightNode = new TreeNode<T>(insertValue);
            else // continue traversing right subtree recursively
                rightNode.insert(insertValue);
        }
    }
} // end class TreeNode

// class Tree definition
public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    // constructor initializes an empty Tree of integers
    public Tree() {
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(T insertValue) {
        if (root == null)
            root = new TreeNode<T>(insertValue); // create root node
        else
            root.insert(insertValue); // call the insert method
    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // recursive method to perform preorder traversal
    private void preorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        System.out.printf("%s ", node.data); // output node data
        preorderHelper(node.leftNode); // traverse left subtree
        preorderHelper(node.rightNode); // traverse right subtree
    }

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        inorderHelper(node.leftNode); // traverse left subtree
        System.out.printf("%s ", node.data); // output node data
        inorderHelper(node.rightNode); // traverse right subtree
    }

    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        postorderHelper(node.leftNode); // traverse left subtree
        postorderHelper(node.rightNode); // traverse right subtree
        System.out.printf("%s ", node.data); // output node data
    }
// end class Tree

    public void outputTree()    {
        outputTree(root, 0);

    }

    private void outputTree(TreeNode<T> node, int totalSpaces) {
        if(node!=null)   {
            outputTree(node.rightNode,totalSpaces+5);
            for(int i = 1;i<=totalSpaces;i++)
                System.out.print(" ");

            System.out.print(node.data + "\n");

            outputTree(node.leftNode,totalSpaces +5);
        }
    }

    public void drawTree(Graphics2D g)    {
        drawTree(root,290,40, g);
    }

    private void drawTree(TreeNode<T> currentNode, int xCoordinate, int yCoordinate,Graphics2D g)   {
        if(currentNode == null) {
            return;
        }
        g.drawString(currentNode.data+"",xCoordinate,yCoordinate);
        if(currentNode.leftNode != null)    {
            int leftXCoordinate = xCoordinate - 100;
            int leftYCoordinate = yCoordinate + 100;
            g.drawLine(xCoordinate,yCoordinate,leftXCoordinate,leftYCoordinate);
            drawTree(currentNode.leftNode,leftXCoordinate,leftYCoordinate,g);
        }
        else if(currentNode.rightNode != null)  {
            int rightXCoordinate = xCoordinate + 100;
            int rightYCoordinate = yCoordinate + 100;
            g.drawLine(xCoordinate,yCoordinate,rightXCoordinate,rightYCoordinate);
            drawTree(currentNode.rightNode,rightXCoordinate,rightYCoordinate,g);
        }
    }

    /*

    private void outputTreeExam(TreeNode<T> node, int level) {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1)
        {
            outputTreeExam(node.leftNode, level-1);

            outputTreeExam(node.rightNode, level-1);
            System.out.println("\t\t");
        }
    }

    public void outputTreeExam() {
        for (int d = 1;d<=height(this.root);d++)
            outputTreeExam(this.root,d);

    }

    //http://www.geeksforgeeks.org/level-order-tree-traversal/
    private int height(TreeNode<T> node)    {
        if (node == null) {
            return 0;
        }
        else
        {
            // compute  height of each subtree
            int lheight = height(node.leftNode);
            int rheight = height(node.rightNode);

            // use the larger one
            if (lheight > rheight)
                return(lheight+1);
            else
                return(rheight+1);
        }
    }*/

}


