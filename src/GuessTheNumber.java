import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int ourGuess;
        int computerNumber;
        int guessCount = 0;
        Random random = new Random();
        boolean guessedNumber = false;

        computerNumber = random.nextInt(100) + 1;

        while (!guessedNumber) {
            System.out.println("Enter your integer guess");
            ourGuess = keyboard.nextInt();
            guessCount++;

            if (ourGuess >= 1 && ourGuess <= 100) {
                if (ourGuess == computerNumber) {
                    System.out.println("Congratulations! You guessed the number in " +
                            guessCount + " guesses! Thanks for playing!");
                    guessedNumber = true;
                } else if (ourGuess > computerNumber) {
                    System.out.println("Your guess was too high!");
                } else {
                    System.out.println("Your guess was too low!");
                }
            } else {
                System.out.println("That was a wasted guess! You must pick a number between 1 and 100, inclusive!");
            }

        }
    }
}