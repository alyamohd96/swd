/**
 *
 */

import java.util.Arrays;

public class Encrypt {

    private final static char alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char[] message;
    private int[] messageInInt;
    private int n;

    /**
     *
     * @param message
     * @param n
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
     *
     * @return
     */
    public char[] getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        if (!isAlpha(message))
            throw new IllegalArgumentException("Only alphabets are allowed");               //throw new exception
        else
            this.message = message.toCharArray();
    }

    /**
     *
     * @return
     */
    public int getN() {
        return n;
    }

    /**
     *
     * @param n
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     *
     */
    public void decrypt() {
        System.out.print("Message is: " + Arrays.toString(message));
        String temp = new String(this.message);
        this.messageInInt = getAlphabetIndex(temp);
        System.out.println("Alphabet Index");
        System.out.print(Arrays.toString(messageInInt));
        this.messageInInt = subtractNValue(this.messageInInt,n);
        System.out.println("\nSubtracted N Value");
        System.out.print(Arrays.toString(messageInInt));
        this.message = convertIntToChar(this.messageInInt);
        System.out.println("\nConverted");
        System.out.print(Arrays.toString(message));
    }

    /******************************************************
     * This method validate the message to contain only
     * alphabets.
     * @param checkMessage
     * @return true if contain only alphabets and spaces.
     *          false if contain besides alphabets
     ******************************************************/
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
     *
     * @param message
     * @return
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
     *
     * @param messageInInteger
     * @return
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
     *
     * @param messageAsInt
     * @param n
     * @return
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
     *
     * @param messageAsInt
     * @param n
     * @return
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
     *
     * @return
     */
    @Override
    public String toString()    {
        return new String(message);
    }
}
