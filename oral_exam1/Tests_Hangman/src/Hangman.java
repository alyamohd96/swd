import java.util.Scanner;

/**
 * http://www.cs.jhu.edu/~joanne/cs107/code/StaticMethods/hangmanMethods.java
 */

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

    public int getBodyparts() {
        return bodyparts;
    }


    public void startHangman(String input)   {

        this.guess = input;

        if(this.guess.length() > 1)  {
            if (this.guess.equals(secret))
                System.out.print("You win");
            else
                System.out.print("You lose");

            this.done = true;
        }

        else    {

            letter = guess.charAt(0);
            guesses += letter;

            if(secret.indexOf(letter) < 0)
                --bodyparts;
            else
                matchLetter(secret, output, letter);


            System.out.print(getBodyparts());   //display body parts

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

    private boolean isDone() {
        return this.bodyparts == 0;
    }

    //when letter matched
    private static void matchLetter(String secret, StringBuffer output, char letter)    {
        for (int index = 0; index < secret.length(); index++)
            if (secret.charAt(index) == letter)
                output.setCharAt(index, letter);
        System.out.print("good guess - ");

    }

    private static StringBuffer makeOutput(String secret)    {
        StringBuffer output = new StringBuffer(secret.length());
        for(int count=0; count < secret.length(); count++)
            output.append('-');
        return output;
    }


    public static void main(String args[])  {
        System.out.print("Enter secret word:");
        Scanner input = new Scanner(System.in);
        String secretWord = input.next();

        Hangman session1 = new Hangman(secretWord);
        while(! session1.done) {
            System.out.print("enter letter/word:");
            session1.startHangman(input.next());

        }

        session1.win = true;


    }

}
