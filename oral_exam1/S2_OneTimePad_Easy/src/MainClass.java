import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)  {


        System.out.println("Enter message. Please ensure that message should not contain any numbers or symbols:");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();

        while (!Encrypt.isAlpha(message)) {

            System.out.println("Message invalid. Please ensure that message should not contain any numbers or symbols:");
            input = new Scanner(System.in);
            message = input.nextLine();

        };

        System.out.println("Enter the n value:");
        Scanner nValue = new Scanner(System.in);
        int n = nValue.nextInt();

        Encrypt secretMessage = new Encrypt(message,n);
        System.out.println("Encrypted Message:");
        System.out.println(secretMessage.toString());
    }
}
