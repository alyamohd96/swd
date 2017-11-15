// Exercise 21.15 Solution//Client.java
import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame implements ActionListener {   private JTextField fileName;   private JTextArea contents;   private BufferedReader bufferInput;   private BufferedWriter bufferOutput;   private Socket connection;   private JPanel p;   private JLabel label;   public Client()   {      p = new JPanel();      label = new JLabel( "Enter file name to retrieve:" );      p.setLayout( new GridLayout( 1, 2, 0, 0 ) );      p.add( label );      fileName = new JTextField();      p.add( fileName );      fileName.selectAll();      fileName.addActionListener( this );      contents = new JTextArea();      Container c = getContentPane();      c.setLayout( new BorderLayout() );      c.add( p, BorderLayout.NORTH );      c.add( contents, BorderLayout.CENTER );      try {         connection = new Socket( InetAddress.getLocalHost(), 5000 );           bufferInput = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );         bufferOutput = new BufferedWriter( new OutputStreamWriter( connection.getOutputStream() ) );      }      catch( IOException ex ) {         ex.printStackTrace();      }      setSize( 300, 300 );      show();   }   public void actionPerformed( ActionEvent e )   {      try {         String t = e.getActionCommand() + "\n";         bufferOutput.write( t, 0, t.length() );         bufferOutput.flush();         String s = bufferInput.readLine();         contents.setText( s );          if ( s.equals( "The file is:" ) ) {            s = bufferInput.readLine();            while ( s != null ) {               contents.append( s + "\n" );               s = bufferInput.readLine();            }         }         fileName.setEditable( false );         fileName.setBackground( Color.lightGray );         fileName.removeActionListener( this );      }      catch ( EOFException eof ) {      }      catch ( IOException ex ) {         ex.printStackTrace();      }   }   public static void main( String args[] )   {      Client p = new Client();      p.addWindowListener(          new WindowAdapter() {            public void windowClosing( WindowEvent e )            {               System.exit( 0 );            }            }      );   }}                                             // Exercise 21.15 Solution// Server.javaimport java.net.*;import java.io.*;public class Server {   private ServerSocket server;   private Socket connection;   private BufferedReader input;   private BufferedWriter output;   public static void main( String args[] )   {      Server s = new Server();      s.runServer();   }   public Server()   {      try {         server = new ServerSocket( 5000, 10 );              }      catch( IOException e ) {         e.printStackTrace();         System.exit( 0 );      }   }   public void runServer()   {      try {         connection = server.accept();         input = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );         output = new BufferedWriter( new OutputStreamWriter( connection.getOutputStream() ) );         File f = new File( input.readLine() );         if ( f.exists() ) {            BufferedReader fileInput =                 new BufferedReader( new InputStreamReader( new FileInputStream( f ) ) );            String s;            output.write( "The file is:\n", 0, 13 );            output.flush();            while ( ( s = ( fileInput.readLine() ) ) != null ) {               output.write( s + '\n', 0, s.length() + 1 );               output.flush();            }            connection.close();         }         else {            String s2 = f.getName() + " does not exist\n";            output.write( s2, 0, s2.length() );            output.flush();         }      }      catch( IOException e ) {         System.err.println( "IOException has occurred!" );         e.printStackTrace();         System.exit( 0 );      }   }}
