public class Encrypt {

    final static char alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char[] message;
    private int n;

    public Encrypt(String message, int n)   {
        this.message = message.toCharArray();
        this.n = n;
    }

    public char[] getMessage() {
        return message;
    }

    public void setMessage(char[] message) {
        this.message = message;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int[] findAlphabetNumber()  {
        int[] messageAsInt = {};
        int c = 0;
        for (int i:message)
            for (int j=0;j<alphabet.length;j++)
                if (message[i] == alphabet[j])
                    messageAsInt[c] = j;
                    c++;

        return messageAsInt;
    }

    private void convertIntToChar(int[] messageInInteger) {

    }
}
