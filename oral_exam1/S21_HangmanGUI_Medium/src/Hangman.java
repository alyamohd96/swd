public class Hangman {

    //instance variables for Hangman game
    private String wordToBeGuessed;
    private char[] output;
    private int numOfGuessesLeft;
    private int exposed;
    private char[] lettersGuessed;

    public Hangman(String wordToBeGuessed)  {
        this.wordToBeGuessed = wordToBeGuessed;
        this.numOfGuessesLeft = 7;
        this.exposed = 0;

    }

    private static void generateOutput() {

    }


}
