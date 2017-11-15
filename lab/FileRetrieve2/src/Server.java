import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends JFrame{

    private ObjectOutputStream output; // output stream to client
    private ObjectInputStream input; // input stream from client
    private int counter = 1; // counter of number of connections
    private ServerSocket server;
    Socket connection;

    public Server() {

    }

    public void runServer() {
        try {
            server = new ServerSocket(12345,100);   //for the linux computers, it'll be between 23500-23999

            while (true) {
                try {
                    waitForConnection(); // wait for a connection
                    getStreams(); // get input & output streams
                    processConnection(); // process connection
                } catch (EOFException eofException) {
                    System.out.print("\nServer terminated connection");
                } finally {
                    closeConnection(); //  close connection
                    ++counter;
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }

    // wait for connection to arrive, then display connection info
    private void waitForConnection() throws IOException {
        System.out.print("Waiting for connection\n");
        connection = server.accept(); // allow server to accept connection
        System.out.print("Connection received from: " +
                connection.getInetAddress().getHostName());
    }


    // get streams to send and receive data
    private void getStreams() throws IOException {
        // set up output stream for objects
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush(); // flush output buffer to send header information

        // set up input stream for objects
        input = new ObjectInputStream(connection.getInputStream());

        System.out.print("\nGot I/O streams\n");
    }

    // process connection with client
    private void processConnection() throws IOException {
        String message = "Enter file name of a text file:\n";
        sendData(message); // send connection successful message

        // enable enterField so server user can send messages
        //setTextFieldEditable(true);

        do // process messages sent from client
        {
            try // read message and display it
            {
                String fileName = (String) input.readObject(); // read new message
                System.out.print(fileName); // display message
            } catch (ClassNotFoundException classNotFoundException) {
                System.out.print("\nFile not found");
            }

        } while (!message.equals("CLIENT>>> TERMINATE"));
    }

    // close streams and socket
    private void closeConnection() {
        System.out.print("\nTerminating connection\n");
        //setTextFieldEditable(false); // disable enterField

        try {
            output.close(); // close output stream
            input.close(); // close input stream
            connection.close(); // close socket
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // send message to client
    private void sendData(String message) {
        try // send object to client
        {
            output.writeObject(message);
            output.flush(); // flush output to client
            System.out.print("\nSERVER>>> " + message);
        } catch (IOException ioException) {
            System.out.print("\nError writing object");
        }
    }

    /*
    // manipulates displayArea in the event-dispatch thread
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

    // manipulates enterField in the event-dispatch thread
    private void setTextFieldEditable(final boolean editable) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() // sets enterField's editability
                    {
                        enterField.setEditable(editable);
                    }
                }
        );
    }*/
}
