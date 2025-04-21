 import java.util.Scanner;
import java.util.Random;

public class Easter2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int compGuess = random.nextInt(10) + 1;
        int userGuess = 0;
        int chance = 0;

        System.out.println("Welcome to the Mystery Game, Guess the number between 1 and 10:");

        while (userGuess != compGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scan.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Invalid number. Please enter a number between 1 and 10.");
                continue; 
            }

            chance = chance + 1; 

            if (userGuess > compGuess) {
                System.out.println("Too high!");
            } else if (userGuess < compGuess) {
                System.out.println("Too low!");
            }
        }

        System.out.println("Congratulations!");
        System.out.printf("It took you %d%n guesses ", chance);
    }
}
