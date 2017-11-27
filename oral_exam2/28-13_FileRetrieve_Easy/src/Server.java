/**
 * Fig. 28.3: Server.java
 * Server portion of a client/server stream-socket connection.
 * This Server class is the class that will act as a server and that will find the file and send it to the client.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Server extends JFrame {
    private JTextField enterField; // inputs message from user
    private JTextArea displayArea; // display information to user
    private ObjectOutputStream output; // output stream to client
    private ObjectInputStream input; // input stream from client
    private ServerSocket server; // server socket
    private Socket connection; // connection to client
    private int counter = 1; // counter of number of connections
    private final Font defaultFont;

    /**
     * This method set up GUI
      */
    public Server() {
        super("Server");

        defaultFont = new Font("Trebuchet MS", Font.PLAIN, 30);
        enterField = new JTextField(); // create enterField
        enterField.setFont(defaultFont);
        enterField.setEditable(false);
        enterField.addActionListener(
                new ActionListener() {
                    // send message to client
                    public void actionPerformed(ActionEvent event) {
                        String fileContent = findFile(event.getActionCommand());
                        //sendData(fileContent);
                        displayMessage(fileContent);
                        enterField.setText("");
                    }
                }
        );

        add(enterField, BorderLayout.NORTH);

        displayArea = new JTextArea(); // create displayArea
        displayArea.setFont(defaultFont);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        setSize(300, 150); // set size of window
        setVisible(true); // show window
    }

    /**
     * This method set up and run server
      */
    public void runServer() {
        try // set up server to receive connections; process connections
        {
            server = new ServerSocket(12345, 100); // create ServerSocket

            while (true) {
                try {
                    waitForConnection(); // wait for a connection
                    getStreams(); // get input & output streams
                    processConnection(); // process connection
                } catch (EOFException eofException) {
                    displayMessage("\nin EOFException from Server");
                    displayMessage("\nServer terminated connection");
                } finally {
                    closeConnection(); //  close connection
                    ++counter;
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /**
     * This method wait for connection to arrive, then display connection info
      */
    private void waitForConnection() throws IOException {
        displayMessage("Waiting for connection\n");
        connection = server.accept(); // allow server to accept connection
        displayMessage("Connection " + counter + " received from: " +
                connection.getInetAddress().getHostName());
    }

    /**
     * This method get streams to send and receive data
      */
    private void getStreams() throws IOException {
        // set up output stream for objects
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush(); // flush output buffer to send header information

        // set up input stream for objects
        input = new ObjectInputStream(connection.getInputStream());

        displayMessage("\nGot I/O streams\n");
    }

    /**
     * This method process connection with client
      */
    private void processConnection() throws IOException {
        String message = "Connection successful";
        sendData(message); // send connection successful message

        // enable enterField so server user can send messages
        setTextFieldEditable(true);

        do // process messages sent from client
        {
            try // read message and display it
            {
                message = (String) input.readObject(); // read new message

                displayMessage("\n" + message); // display message

                //my code:
                String fileContents = findFile(message);
                sendData(fileContents);

            } catch (ClassNotFoundException classNotFoundException) {
                displayMessage("\nUnknown object type received");
            }

        } while (!message.equals("CLIENT>>> TERMINATE"));
    }

    /**
     * This method close streams and socket
      */
    private void closeConnection() {
        displayMessage("\nTerminating connection\n");
        setTextFieldEditable(false); // disable enterField

        try {
            output.close(); // close output stream
            input.close(); // close input stream
            connection.close(); // close socket
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /**
     *This method find the file. The file MUST BE IN THE SAME DIRECTORY AS THE SOURCE CODE.
     * "C:\\Users\\alyam\\Git\\ttmohd_swd\\lab\\FileRetrieve2\\src\\"
     * @param fileName
     * @return The contents of the file
     */
    private String findFile(String fileName) {
        //TODO change the pathOfFile
        String pathOfFile = new String("/user/t/ttmohd/git/ttmohd_swd/oral_exam2/28-13_FileRetrieve_Easy/src/" + fileName);
        displayMessage("\nSERVER>>> " + pathOfFile);

        Path path = Paths.get(pathOfFile);
        //File fileDirectory = Files(getClass().getResource(fileName).toURI());

        if(path!= null && Files.exists(path)) {
            try {
                byte[] fileContent = Files.readAllBytes(path);
                return new String(fileContent);
            }
            catch(IOException ioException)  {
                return "\n Unable to read file";
            }
        }
        else    {
            return "File does not exists";
        }
    }


    /**
     *  send message to client
     * @param message message to be send to client
     */
    private void sendData(String message) {
        try // send object to client
        {
            output.writeObject("SERVER>>> " + message);
            output.flush(); // flush output to client
            displayMessage("\nSERVER>>> " + message);
        } catch (IOException ioException) {
            displayArea.append("\nError writing object");
        }
    }

    /**
     * This method manipulates displayArea in the event-dispatch thread
      */
    private void displayMessage(final String messageToDisplay) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() // updates displayArea
                    {
                        displayArea.append(messageToDisplay); // append message
                    }
                }
        );
    }

    /**
     * manipulates enterField in the event-dispatch thread
     * @param editable
     */
    private void setTextFieldEditable(final boolean editable) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() // sets enterField's editability
                    {
                        enterField.setEditable(editable);
                    }
                }
        );
    }
}

