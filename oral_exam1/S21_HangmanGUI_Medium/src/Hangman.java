import java.util.Scanner;

public class Hangman {

    //instance variables for Hangman game
    private String wordToBeGuessed;
    private char[] output;
    private int numOfTries;
    private int exposed;
    private char[] lettersGuessed;

    public Hangman(String wordToBeGuessed)  {
        this.wordToBeGuessed = wordToBeGuessed.toUpperCase();
        this.numOfTries = 0;
        this.exposed = 0;
        output = new char[wordToBeGuessed.length()];
        for(int i = 0; i < wordToBeGuessed.length();i++)
            output[i] = '*';
    }

    public String getWordToBeGuessed() {
        return wordToBeGuessed;
    }

    public char[] getOutput() {
        return output;
    }

    public int getNumOfTries() {
        return numOfTries;
    }

    public int getExposed() {
        return exposed;
    }

    public char[] getLettersGuessed() {
        return lettersGuessed;
    }

    private void checkLetter(char letter)   {
        numOfTries++;
        lettersGuessed[numOfTries] = letter;
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            if ((letter == wordToBeGuessed.charAt(i)) && (output[i] == '*'))
            output[i] = wordToBeGuessed.charAt(i);
            exposed++;
        }
    }

    private String gameStatus() {
        if (exposed == output.length)   {
            return "You win!";
        }
        return "You lose!";
    }

    public static void main(String args[])  {
        Hangman hangman1 = new Hangman("different");
        String secret = new String(hangman1.getOutput());
        System.out.print("Guess this:");
        System.out.print(secret);
        Scanner keyboard = new Scanner(System.in);
        char input = keyboard.next().charAt(0);
        hangman1.checkLetter(input);

    }


}
