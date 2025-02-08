package lectures.lecture10.exercises;

import java.util.Scanner;

public class E3_UserAgeValidation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your age, valid range is 0-120: ");
        int userInput = sc.nextInt();

        handleAgeValidation(userInput);

        sc.close();
    }

    // call the validateAge method and handles any propagated exceptions
    static void handleAgeValidation(int userAge) {
        try {
            int validAge = validateAge(userAge);
            System.out.println("Great! Valid age entered: " + validAge);
        } catch (IllegalArgumentException exIA) {
            System.out.println("Exception occurred! Please fix and try again: " + exIA.getMessage());
        }
    }

    // checks the input with a condition and throws and exception to be handled upwards in the code
    static int validateAge(int userAge) throws IllegalArgumentException {
        if (userAge < 0 || userAge > 120) {
            throw new IllegalArgumentException("Entered age is outside of bounds 0-120");
        }
        return userAge;
    }
}

