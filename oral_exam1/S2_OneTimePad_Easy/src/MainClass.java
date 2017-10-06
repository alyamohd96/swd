import java.util.Scanner;

/**
 * This is a driver class for the Encrypt class. This class
 * asks for a prompt for a secret message and create an object
 * of type Encrypt and prints the encrypted message. Then the encrypt
 * object calls the decrypt method to decrypt the message
 */
public class MainClass {

    public static void main(String[] args)  {

        /**
         * Prompts from the user a secret message to be encrypted
         */
        System.out.println("Enter message. Please ensure that message should not contain any numbers or symbols:");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();

        /**
         * Prompts from the user an n value to encrypt the message
         */
        System.out.println("Enter the n value:");
        Scanner nValue = new Scanner(System.in);
        int n = nValue.nextInt();

        /**
         * Creates an object of type encrypt and prints out the encrypted message.
         */
        Encrypt secretMessage = new Encrypt(message,n);
        System.out.println("Encrypted Message:");
        System.out.println(secretMessage.toString());

        /**
         * calls the decrypt method to decrypt the message
         */
        secretMessage.decrypt();
        System.out.println("Decrypted Message:");
        System.out.println(secretMessage.toString());
    }
}
