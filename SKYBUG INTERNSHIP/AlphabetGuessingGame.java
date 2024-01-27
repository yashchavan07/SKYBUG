import java.util.Random;
import java.util.Scanner;

public class AlphabetGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char minChar = 'A';
        char maxChar = 'Z';
        int maxAttempts = 10;
        int score = 0;

        boolean playAgain = true;

        while (playAgain) {
            char generatedChar = (char) (random.nextInt(maxChar - minChar + 1) + minChar);
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Alphabet Guessing Game!");
            System.out.println("Guess the letter between " + minChar + " and " + maxChar);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                char userGuess = Character.toUpperCase(scanner.next().charAt(0));
                attempts++;

                if (userGuess == generatedChar) {
                    System.out.println("Congratulations! You guessed the correct letter in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < generatedChar) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct letter was: " + generatedChar);
            } else {
                score++;
                System.out.println("Your current score: " + score);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
