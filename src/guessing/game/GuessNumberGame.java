package guessing.game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a game! It's called Guess The Number.\n");
        GuessNumberGame game = new GuessNumberGame();
        game.willPlay();

    }

    public void willPlay(){

        boolean validAnswer = false;
        while(!validAnswer) {
            System.out.println("Do you want to play? Type y for yes, n for no: ");
            String play = scanner.nextLine();
            if(play.equals("y")) {
                startGame();
                validAnswer = true;
            } else if (play.equals("n")) {
                System.out.println("You are no fun! Goodbye!!!");
                validAnswer = true;
            } else {
                System.out.println("I don't understand your answer. Please type y for yes, or n for no! Try again!");
            }
        }
    }
    public void startGame() {
        boolean guessedRight = false;
        int numberOfGuesses = 0;
        System.out.println("Welcome player!");
        int number = getRandomNumber();
        System.out.println(number);

        while(!guessedRight){
            int userNumber = getUserGuessedNumber();
            System.out.println(userNumber);

            if(userNumber > number) {
                System.out.println("Sorry, the number you guessed is too high\n");
            } else if (userNumber < number) {
                System.out.println("Sorry, the number you guessed is too low\n");
            } else if (userNumber == number) {
                System.out.println("Congratulations! Your guess is correct!\n");
                guessedRight = true;
            } else {
                System.out.println("Invalid entry. Please try again and use integers only");
            }
            numberOfGuesses++;
        }
        System.out.println("You found the number in " + numberOfGuesses + " guesses");
        String level = getLevel(numberOfGuesses);
        System.out.println("You are a " + level + " !!!");

    }

    public int getRandomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000); //between 0 and 999
        return randomNumber +1;
    }

    public int getUserGuessedNumber() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Please guess the number: ");
        return scanner.nextInt();
        //close connection?
    }

    public String getLevel(int totalNumberOfGuesses) {
        String level;

        if (totalNumberOfGuesses <= 5) {
            level = "genius";
        } else if (totalNumberOfGuesses <= 10) {
            level = "boss";
        } else {
            level = "noob";
        }
        return level;
    }
}
