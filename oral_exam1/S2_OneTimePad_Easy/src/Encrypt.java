
import java.util.Arrays;

/**
 * This Encrypt class is a class that encrypts and decrypts a secret message.
 * It takes in a secret message and a value "n" from a user. It takes the alphabet index
 * and add the n value to the index. Then it will change the index back to the alphabet that
 * corresponds to the new index.
 */
public class Encrypt {

    /**
     * The "alphabet" is character array that stores all of the alphabet. It is also
     * static and final.
     */
    private final static char alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    /**
     * The "message" is a character array that stores the secret after it is encrypted
     */
    private char[] message;

    /**
     * messageInInt is an integer array stores the message in integer based on the alphabet index
     */
    private int[] messageInInt;

    /**
     * n stores the value n which is the number that would be added to the alphabet index
     */
    private int n;

    /**
     * This is the constructor for Encrypt class. It takes in two
     * arguments. One secret message of type String and one n value
     * of type integer.
     * @param message the secret message of type String
     * @param n the n value to encrypt of type integer
     */
    public Encrypt(String message, int n)   {
        //Validation so that no number or symbols is in the message
        if (!isAlpha(message))
            throw new IllegalArgumentException("Only alphabets are allowed");          //throw exception here
        else
            this.n = n;
            message = message.toUpperCase();
            this.messageInInt = getAlphabetIndex(message);
            System.out.println("Alphabet Index");
            System.out.print(Arrays.toString(messageInInt));
            this.messageInInt = addNValue(this.messageInInt, n);
            System.out.println("added N");
            System.out.print(Arrays.toString(messageInInt));
            this.message = convertIntToChar(this.messageInInt);
            System.out.println("encrypted");
            System.out.print(Arrays.toString(messageInInt));
    }

    /**
     * This is an accessor method for the instance variable message
     * @return the secret message after it is encrypted
     */
    public char[] getMessage() {
        return message;
    }

    /**
     * This is a mutator method that sets the message instance variable. It also checks whether it only contains alphabets. It will throw
     * an IllegalArgumentException when the message has symbols and numbers in it
     * @param message the message to be set to
     * @throws IllegalArgumentException when the message contains anything other than alphabets
     */
    public void setMessage(String message) {
        if (!isAlpha(message))
            throw new IllegalArgumentException("Only alphabets are allowed");               //throw new exception
        else
            this.message = message.toCharArray();
    }

    /**
     * An accessor methods to get the value of n
     * @return the value of n
     */
    public int getN() {
        return n;
    }

    /**
     * A mutator method to set n.
     * @param n the value of n to be set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * A method that decrypts the message after it has been encrypted. It uses the n value stored in the n instance variable
     * and calls the static methods to decrypt it
     */
    public void decrypt() {
        // System.out.print("Message is: " + Arrays.toString(message));
        String temp = new String(this.message);
        this.messageInInt = getAlphabetIndex(temp);
        //System.out.println("Alphabet Index");
        //System.out.print(Arrays.toString(messageInInt));
        this.messageInInt = subtractNValue(this.messageInInt,n);
        //System.out.println("\nSubtracted N Value");
        //System.out.print(Arrays.toString(messageInInt));
        this.message = convertIntToChar(this.messageInInt);
        //System.out.println("\nConverted");
        //System.out.print(Arrays.toString(message));
    }

    /**
     * This method validate the message to contain only
     * alphabets.
     * @param checkMessage
     * @return true if contain only alphabets and spaces.
     *          false if contain besides alphabets
     */
    public static boolean isAlpha(String checkMessage) {
        char[] chars = checkMessage.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && !(c == ' ')) {
                return false;
            }
        }
        return true;
    }

    /**
     * This static method gets the alphabet index from the message.
     * @param message the secret message
     * @return an integer array that contains the secret message in its index
     */
    private static int[] getAlphabetIndex(String message)   {
        char[] messageCharArray  = message.toCharArray();
        int i = 0;
        int[] messageInInt = new int[messageCharArray.length];
        for(char c : messageCharArray)
        {
            int temp = (int)c;
            int temp_integer = 64; //for upper case
            if(temp>=65 && temp<=90) {
                messageInInt[i] = temp - temp_integer;
                //System.out.print(temp - temp_integer + " ");
            }
            else {
                messageInInt[i] = 100;
                //System.out.println(" space ");
            }
            i++;
        }
        return messageInInt;
    }

    /**
     * This static method converts a message in integers to alphabets using the alphabet's instance variables.
     * @param messageInInteger the message in integers after encryption
     * @return a character array of the encrypted message
     */
    private static char[] convertIntToChar(int[] messageInInteger) {
        char[] convertedMessage = new char[messageInInteger.length];

        for(int i=0; i < messageInInteger.length;i++) {
            if (messageInInteger[i] >= 100)
                convertedMessage[i] =' ';
            else
                convertedMessage[i] = alphabet[messageInInteger[i]-1];
        }
        //System.out.print(Arrays.toString(convertedMessage) + "\n");
        return convertedMessage;
    }

    /**
     * This static methods accepts two arguments; an integer array that contains the message and an n value.
     * This methods does the encryption by adding the n value to every element in the integer array
     * @param messageAsInt the message to be encrypted in integers
     * @param n the n value to be added to the message
     * @return the encrypted message in integers
     */
    private static int[] addNValue(int[] messageAsInt, int n)   {
        for (int i =0;i<messageAsInt.length;i++) {
            messageAsInt[i] += n;
            if (messageAsInt[i] >= 26 && messageAsInt[i] < 100)
                messageAsInt[i] -= 26;
        }
        return messageAsInt;
    }

    /**
     * This method accepts two arguments; an integer array that contains the message to be decrypted and an n value.
     * This methods does the decryption by subtracting the n value to every element in the integer array
     * @param messageAsInt the message to be decrypted in an integer array
     * @param n the n value to be subtracted from the message
     * @return the decrypted message
     */
    private int[] subtractNValue(int[] messageAsInt, int n) {
        for (int i =0;i<messageAsInt.length;i++) {
            messageAsInt[i] -= n;
            if (messageAsInt[i] < 0 )
                messageAsInt[i] = 25 + messageAsInt[i];
            else if(messageAsInt[i] >= 26)
                messageAsInt[i] = 100;
        }
        return messageAsInt;
    }

    /**
     * This method override the Objects toString method.
     * @return a string of the message.
     */
    @Override
    public String toString()    {
        return new String(message);
    }
}
