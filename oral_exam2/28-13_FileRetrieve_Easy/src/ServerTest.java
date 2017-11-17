import javax.swing.*;

public class ServerTest {
    public static void main(String[] args) {
        Server application = new Server(); // create server
        application.setSize(1000,500);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.runServer(); // run server application

    }
}