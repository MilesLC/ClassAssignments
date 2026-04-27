package GuessingGame;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

      public static void main(String[] args) {
            //Greet the user to the game
            System.out.println("Welcome to the Guessing Game 5000!");
            //Ask the user for the name
            Scanner input = new Scanner(System.in);
            //String input
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            
            //Random variable
            //Random Import for Random number generation
            Random rand = new Random();
            int randNum = rand.nextInt(101);
            
            //Give the user instructions
            System.out.println("Welcome again, " + name + "...");
            System.out.println("I'm thinking of a number between 1 and 100, can you guess it?");
            
            //System message asking for guess
            System.out.println("Please enter your guess: ");
            int userGuess = input.nextInt();
            System.out.println(userGuess);
            
            int counter = 1;
            
            while (true) {
                  if (userGuess > randNum) {
                        System.out.println("Try again! Your guess is too high");
                        System.out.println("Please enter your guess: ");
                        userGuess = input.nextInt();
            
                  }
                  else if (userGuess < randNum) {
                  System.out.println("Try again! Your guess is too low");
                  System.out.println("Please enter your guess: ");
                  userGuess = input.nextInt();        
            
                  }
                  else if (userGuess == randNum) {
                        System.out.println("Congrats! You got the number in " + counter + " guesses!");
                        break;

      
                  }
                  else {
                        System.out.println("Invalid character");
                        break;

                  }
                  counter++;
            }     
            
            input.close();
      }
}