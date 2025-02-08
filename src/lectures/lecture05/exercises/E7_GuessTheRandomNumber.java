package lectures.lecture05.exercises;

import java.util.Scanner;
import java.util.Random; //import random utility

public class E7_GuessTheRandomNumber {

    static Scanner sc = new Scanner(System.in);

    // declare Random as a class-level field for generating random numbers
    static Random randomNumGenerator = new Random();

    public static void main(String[] args) {

        guessTheNumber();

        sc.close();
    }

    // guess the random number by input
    static void guessTheNumber() {

        // generate random num between 0 and 100 inclusive
        int randomNum = randomNumGenerator.nextInt(101);

        /* for debugging uncomment the following line to observe the random number in output
        System.out.println("[CONTROL FUNCTION] The random number is:  " + randomNum);
        */

        System.out.println("Please guess the random number by entering a value between 0-100: ");
        int userGuess = sc.nextInt();

        do {
            if (userGuess > randomNum) {
                System.out.println("Too high! Please try again.");
                userGuess = sc.nextInt();
            } else if (userGuess < randomNum) {
                System.out.println("Too low! Please try again.");
                userGuess = sc.nextInt();
            }
        } while (userGuess != randomNum);
        System.out.println("Congrats, you got it!!! the number is " + randomNum);
    }
}
