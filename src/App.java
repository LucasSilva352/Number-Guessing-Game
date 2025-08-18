import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int randNumber = r.nextInt(100);
        String difficultySelected = null;
        int difficultySelNum = 0;
        int playerChoice = 0;
        int numChances = 0;
        int guess = 0;
        int numAttempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You need to guess a number between 1 and 100");
        System.out.println("You can choose between easy, medium and hard for the difficulty");
        System.out.println("With 10, 5 and 1 chances respectively");

        do {
            System.out.println("Please select the difficulty level:");
            System.out.println("Please press 1 for easy");
            System.out.println("Please press 2 for medium");
            System.out.println("Please press 3 for hard");
            difficultySelNum = s.nextInt();    
            if (difficultySelNum == 1) {
                numChances = 10;
                difficultySelected = "easy";
            } else if (difficultySelNum == 2){
                numChances = 5;
                difficultySelected = "medium";
            } else if (difficultySelNum == 3) {
                numChances = 1;
                difficultySelected = "hard";
            } else {
                System.out.println("Error! Please try again");
            }
        } while (difficultySelNum != 1 || difficultySelNum != 2 || difficultySelNum != 3);

        System.out.println("Very well! You selectect " + difficultySelected);

        while (numChances != 0) {
            System.out.println("You have " + numChances + " chances");
            System.out.println("Enter your guess: ");
            guess = s.nextInt();
            numAttempts++;

            if (guess == randNumber){
            System.out.println("You guessed the right number! It took you " + numAttempts + " attempts to guess the correct number!");
            break;
            } else {
                if (randNumber > guess) {
                    System.out.println("You guessed the wrong number! the number is greater than " + guess);
                } else  if (randNumber < guess){
                    System.out.println("You guessed the wrong number! the number is less than " + guess);
                    numChances--;
                    continue;
                }
            }
        }
    }
}
