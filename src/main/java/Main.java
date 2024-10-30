/**
 * Created by iyasuwatts on 10/17/17.
 */

//import jdk.internal.org.jline.terminal.TerminalBuilder;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Guess the number between 1 and 20");

        playGuessingGame();

        while (true) {
            System.out.println("Do you want to play again? Type y / n and hit enter");

            Scanner scan = new Scanner(System.in);
            String playAgain = scan.next();

            if (playAgain.charAt(0) == 'y') {
                System.out.println("picked a new number. Good luck!");
                playGuessingGame();
            } else {
                System.out.println("Thanks for playing!");
                break;
            }
        }

    }

    public static void playGuessingGame() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int guess;
        int attempt = 0;
        int number = rand.nextInt(20) + 1;

        guess = scan.nextInt();

        while (guess != number) {
            if (guess < number)
                System.out.println("too small!");
            else if (guess > number)
                System.out.println("too large!");
            else if (guess == number) {
                System.out.println("Correct!");
            }
            guess = scan.nextInt();
        }
    }

    public static int countGuesses(int guesses) {
        int count = 0;
        for (int i = 0; i <= guesses; i++){
            count += 1;
        }
        System.out.println("your attemps: "+ count);
        return count;


    }
}