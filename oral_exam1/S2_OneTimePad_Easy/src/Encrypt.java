public class Encrypt {

    private final static char alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char[] message;
    private int[] messageInInt;
    private int n;

    public Encrypt(String message, int n)   {
        //Validation so that no number or symbols is in the message
        if (!isAlpha(message))
            throw new IllegalArgumentException("Only alphabets are allowed");          //throw exception here
        else
            this.n = n;
            this.messageInInt = findAlphabetNumber(message.toCharArray());
            this.messageInInt = addNValue(messageInInt, n);
            this.message = convertIntToChar(messageInInt);
    }

    public char[] getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (!isAlpha(message))
            throw new IllegalArgumentException("Only alphabets are allowed");               //throw new exception
        else
            this.message = message.toCharArray();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    /******************************************************
     * This method validate the message to contain only
     * alphabets.
     * @param checkMessage
     * @return true if contain only alphabets and spaces.
     *          false if contain besides alphabets
     ******************************************************/
    private static boolean isAlpha(String checkMessage) {
        char[] chars = checkMessage.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && !(c == ' ')) {
                return false;
            }
        }
        return true;
    }

    /*
    private static boolean isNValid(int n)  {
        if (n > 25)
            return false;
        return true;
    }*/

    private static int[] findAlphabetNumber(char[] message)  {
        int[] messageAsInt = {};
        int c = 0;
        for (int i:message)
            for (int j=0;j<alphabet.length;j++)
                if (message[i] == ' ')
                    messageAsInt[c] = 100;
                else if (message[i] == alphabet[j])
                    messageAsInt[c] = j;
                    c++;

        return messageAsInt;
    }

    private static char[] convertIntToChar(int[] messageInInteger) {
        char[] convertedMessage = {};
        for(int i:messageInInteger)
            if(messageInInteger[i] >= 100)
                convertedMessage[i] = ' ';
            else
                convertedMessage[i] = alphabet[messageInInteger[i]];

        return convertedMessage;
    }


    private static int[] addNValue(int[] messageAsInt, int n)   {
        for (int i =0;i<messageAsInt.length;i++) {
            messageAsInt[i] += n;
            if (messageAsInt[i] >= 26 && messageAsInt[i] < 100)
                messageAsInt[i] -= 26;
        }

        return messageAsInt;
    }

    @Override
    public String toString()    {
        return new String(message);
    }
}
