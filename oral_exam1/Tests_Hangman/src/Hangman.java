public class Hangman {

    private final int MAXPARTS = 6;
    private String secret;
    private StringBuffer output;
    private int bodyparts;
    private boolean done;
    private String guessWord;
    private String lettersGuessed;
    private char inputLetter;

    private char guessLetter;

    public Hangman(String secret)    {
        this.secret = secret;
        this.lettersGuessed = "";
        this.bodyparts = MAXPARTS;
        this.done = false;


    }

    private static StringBuffer makeOutput(String secret)    {
        StringBuffer output = new StringBuffer(secret.length());
        for(int count=0; count < secret.length(); count++)
            output.append('-');
        return output;
    }


}
