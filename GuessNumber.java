 import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;   // random number 1-100
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low!");
            } 
            else if (guess > number) {
                System.out.println("Too high!");
            } 
            else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }

        } while (guess != number);

        sc.close();
    }
} 
    

