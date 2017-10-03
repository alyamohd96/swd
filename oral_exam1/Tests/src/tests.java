import java.util.Scanner;

public class tests {

        // return # of times user missed
        public static int guessWord (String word){
            int missed = 0;
            Scanner keyboard = new Scanner(System.in);
            int len = word.length();
            char output[] = new char[len];
            int exposed = 0;

            for (int i = 0; i < len; i++) {
                output[i] = '*';
            }

            while (exposed < len) {
                System.out.print("Guess the letters in ");
                for (int i = 0; i < len; i++)
                    System.out.print(output[i]);
                System.out.print(": ");

                // get one letter input from user
                char input = keyboard.next().charAt(0);

                boolean matched = false;
                for (int i = 0; i < len; i++) {
                    // input matches a letter in word,
                    // also it is not exposed yet.
                    if ((input == word.charAt(i)) && (output[i] == '*')) {
                        output[i] = word.charAt(i);
                        exposed++;
                        matched = true;
                    }
                }
                if (!matched)
                    missed++;
            }
            System.out.println("Good job! Word is \"" + word + "\"");
            return missed;
        }

        /**
         * @param args the command line arguments
         */

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("You missed " + guessWord("different") +
                " times to guess different.");
    }
}


