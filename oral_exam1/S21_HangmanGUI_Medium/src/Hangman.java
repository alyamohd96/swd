/**
 * http://www.cs.jhu.edu/~joanne/cs107/code/StaticMethods/hangmanMethods.java
 */

//import java.util.Scanner;

public class Hangman {

    private final int MAXPARTS = 6;
    private String secret;
    private StringBuffer output;
    private int bodyparts;
    private boolean done;
    private String guess;
    private String guesses;
    private char letter;
    private boolean win;

    public Hangman(String secret)    {
        this.secret = secret;
        this.guesses = "";
        this.bodyparts = MAXPARTS;
        this.done = false;
        this.output = makeOutput(secret);
        this.win = false;
    }

    public int getMAXPARTS() {
        return MAXPARTS;
    }

    public String getSecret() {
        return secret;
    }

    public StringBuffer getOutput() {
        return output;
    }

    public int getBodyparts() {
        return bodyparts;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getGuesses() {
        return guesses;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void startHangman(String input)   {

        this.guess = input;

        if(this.guess.length() > 1)  {
            if (this.guess.equals(secret))  {
                win = true;
            }
            else
                win = false;

            this.done = true;
        }

        else    {

            letter = guess.charAt(0);
            guesses += letter;

            if(secret.indexOf(letter) < 0) {
                --bodyparts;
            }
            else
                matchLetter(secret, output, letter);


            if(isDone())    {
                win = false;
                done = true;
            }
            else if(secret.equals(output.toString())) {
                win = true;
                done = true;
            }

        }

    }

    public boolean isDone() {
        return this.bodyparts == 0;
    }

    //when letter matched
    private static void matchLetter(String secret, StringBuffer output, char letter)    {
        for (int index = 0; index < secret.length(); index++)
            if (secret.charAt(index) == letter)
                output.setCharAt(index, letter);


        //System.out.print("good guess : ");

    }

    private static StringBuffer makeOutput(String secret)    {
        StringBuffer output = new StringBuffer(secret.length());
        for(int count=0; count < secret.length(); count++)
            output.append('-');

        //System.out.print("in make output: " + output);
        return output;
    }


    /*
    public static void main(String args[])  {
        System.out.print("Enter secret word:");
        Scanner input = new Scanner(System.in);
        String secretWord = input.next();

        Hangman session1 = new Hangman(secretWord);
        while(! session1.done) {

            System.out.print("enter letter/word:");
            session1.startHangman(input.next());


        }*/


}

