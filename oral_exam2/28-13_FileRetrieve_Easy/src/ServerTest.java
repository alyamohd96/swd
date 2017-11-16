public class ServerTest {
    public static void main(String[] args) {
        Server application = new Server(); // create server
        application.runServer(); // run server application

        /*
        try {
            PrintWriter wherethefuck = new PrintWriter("file.txt","UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
    }
}