// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private final JTextField textField1; // text field with set size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JTextField textField4;
    private final JPasswordField passwordField; // password field with text

    // TextFieldFrame constructor adds JTextFields to JFrame
    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        // construct textfield with 10 columns
        textField1 = new JTextField(10);
        add(textField1); // add textField1 to JFrame

        // construct textfield with default text
        textField2 = new JTextField("Enter text here");
        add(textField2); // add textField2 to JFrame

        // construct textfield with default text and 21 columns
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false); // disable editing
        add(textField3); // add textField3 to JFrame

        textField4 = new JTextField("Enter Name Here");
        add(textField4);


        // construct passwordfield with default text
        passwordField = new JPasswordField("Hidden text");
        add(passwordField); // add passwordField to JFrame

        // register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
        textField4.addActionListener(handler);
    } // end TextFieldFrame constructor

    // private inner class for event handling
    private class TextFieldHandler implements ActionListener {
        // process textfield events
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";
            // user pressed Enter in JTextField textField1
            if (event.getSource() == textField1)
                string = String.format("textField1: %s",
                        event.getActionCommand());

                // user pressed Enter in JTextField textField2
            else if (event.getSource() == textField2)
                string = String.format("textField2: %s",
                        event.getActionCommand());

                // user pressed Enter in JTextField textField3
            else if (event.getSource() == textField3)
                string = String.format("textField3: %s",
                        event.getActionCommand());

                // user pressed Enter in JTextField passwordField
            else if (event.getSource() == passwordField)
                string = String.format("passwordField: %s",
                        event.getActionCommand());

            else if (event.getSource() == textField4)
                string = String.format("textField4: %s",
                        event.getActionCommand());

            // display JTextField content
            JOptionPane.showMessageDialog(null, string);
        }
    } // end private inner class TextFieldHandler
} // end class TextFieldFrame

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
