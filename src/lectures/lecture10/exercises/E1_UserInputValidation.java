package lectures.lecture10.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1_UserInputValidation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        enterInteger();

        sc.close();
    }
    
     static void enterInteger() {
        System.out.println("This program takes an integer and prints it out.");

        while (true) {
            try {
                System.out.println("Please enter an integer now: ");
                int intCheck = sc.nextInt();
                System.out.println("Great! User entered valid integer: " + intCheck);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect input provided! Please try again.");
            } finally {
                sc.nextLine(); // clear the buffer
            }
        }
    }
}
