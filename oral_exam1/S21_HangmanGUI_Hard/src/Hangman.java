import javax.swing.*;

/**
 * This Hangman class is a class that have the methods and the logic for the
 * basic hangman game. The code for this class is inspired by the following website:
 * http://www.cs.jhu.edu/~joanne/cs107/code/StaticMethods/hangmanMethods.java
 * This version of hangman however do not detect whether the user have input
 * the same letters in the guess
 */
public class Hangman extends JPanel{

    /**
     * MAXPARTS is a final instance variable of type int that stores the maximum number
     * of tries for the Hangman game
     */
    private final int MAXPARTS = 6;
    /**
     * secret is an instance variable of type String that stores the secret word/the word to be guessed
     */
    private String secret;
    /**
     * output is an instance variable to type StringBuffer that stores the output to show the user
     * after every guess
     */
    private StringBuffer output;
    /**
     * bodyparts is an instance variable of type int that stores the number of bodyparts left
     * after each guess. the initial default value is MAXPARTS.
     */
    private int bodyparts = MAXPARTS;
    /**
     * done is an instance variable of type boolean that stores the value whether the game has ended.
     * It will be set to true if it has and vice versa
     */
    private boolean done;
    /**
     * guess is an instance variable of type String that stores the user's guess whether it is a letter of
     * a word
     */
    private String guess;
    /**
     * guesses is a string that stores all the letters of that have been guessed
     */
    private String guesses;
    /**
     * letter of type char stores the letter the user have guessed
     */
    private char letter;
    /**
     * win stores the a true value if the player won or vice versa
     */
    private boolean win;

    /**
     * This Hangman constructor has a parameter of type String which is the word to be guessed
     * by player. It will set the instance variables to their default values.
     * @param secret the word to be guessed by the player
     */
    public Hangman(String secret)    {
        this.secret = secret;
        this.guesses = "";
        this.bodyparts = MAXPARTS;
        this.done = false;
        this.output = makeOutput(secret);
        this.win = false;
    }

    /**
     * an accessor method that returns the value of the instance variable
     * MAXPARTS
     * @return an integer that contains the value of MAXPARTS which is 6
     */
    public int getMAXPARTS() {
        return MAXPARTS;
    }

    /**
     * an accessor method that returns the word to be guessed by the player
     * @return the word to be guessed in type String
     */
    public String getSecret() {
        return secret;
    }

    /**
     * an accessor methods that returns the output instance variable
     * @return a StringBuffer that contains the output
     */
    public StringBuffer getOutput() {
        return output;
    }

    /**
     * an accessor method that returns the value of the instance variable
     * bodyparts
     * @return the int value in bodyparts
     */
    public int getBodyparts() {
        return bodyparts;
    }

    /**
     * an accessor method that returns the contents of the instance variable
     * guesses
     * @return the contents of guesses in type String
     */
    public String getGuesses() {
        return guesses;
    }

    /**
     * an accessor method that returns the value in the instance variable win
     * @return the boolean value in win
     */
    public boolean isWin() {
        return win;
    }

    /**
     * this method is called each time after a player has entered their guess.
     *
     * the method first check whether the input from user is a word or a letter.
     * If it is a word, the method will check to see if the word matches the secret
     * word. If the player has guessed correctly, then the instance variable win will
     * be set to true to indicate the user has win and vice versa. Then it will set the value
     * of done to true to indicate that the game has ended
     *
     * if the user has input a letter, the method will check whether the letter contains in
     * the word and the letter will be added to the instance variable guesses. If the letter is
     * not contained in the word, the instance variable bodyparts will be decremented. If yes,
     * then the method will call the method matchLetter to generate the outuput to be shown to the user.
     *
     * Then the method will check whether the game has ended. If yes the value win will be set to false.
     * The method will also checks whether the output is equal to the secret word(check whether all letters
     * have been guessed). If yes, the value win will be set to true
     * @param input the user's guess
     */
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

    /**
     * This method returns checks whether the game is done by checking
     * whether the bodyparts left of the hangman is equal to 0
     * @return true if bodyparts is equal to 0
     */
    public boolean isDone() {
        return this.bodyparts == 0;
    }

    /**
     * This static method will called when the user's letter matches a letter in
     * the word. it will expose the letters guessed in the output
     * @param secret the word to be guessed
     * @param output the output for the user
     * @param letter the letter guessed by the user
     */
    //when letter matched
    private static void matchLetter(String secret, StringBuffer output, char letter)    {
        for (int index = 0; index < secret.length(); index++)
            if (secret.charAt(index) == letter)
                output.setCharAt(index, letter);


    }

    /**
     * This static method generates dashes for the secret word when the hangman
     * games starts
     * @param secret the word to be guessed by user
     * @return the new output of type StringBuffer
     */
    private static StringBuffer makeOutput(String secret)    {
        StringBuffer output = new StringBuffer(secret.length());
        for(int count=0; count < secret.length(); count++)
            output.append('-');

        return output;
    }


}

