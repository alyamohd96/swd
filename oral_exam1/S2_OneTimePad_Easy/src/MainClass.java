import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)  {

        System.out.println("Enter message. Please ensure that message should not contain any letters or symbols:");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        System.out.println("Enter the n value:");
        Scanner nValue = new Scanner(System.in);
        int n = input.nextInt();

        Encrypt messageToEncrypt = new Encrypt(message,n);

    }
}
