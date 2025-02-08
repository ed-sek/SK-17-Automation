package lectures.lecture08.exercises;

import java.util.Scanner;

public class E3_DisplayMiddleCharacterOfString {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a string to find its middle character(s): ");
        String stringToCheck = sc.nextLine();

        displayTheMiddleCharOfString(stringToCheck);

        sc.close();
    }

    // display the middle character of a string
    private static void displayTheMiddleCharOfString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            System.out.println("Invalid input: The string cannot be null or empty. Please provide a valid string.");
            return; // exit the method prematurely
        }

        int lengthOfString = inputString.length();
        if (lengthOfString % 2 == 0) {
            // even-length string
            char leftMiddleChar = inputString.charAt((lengthOfString / 2) - 1);
            char rightMiddleChar = inputString.charAt(lengthOfString / 2);

            System.out.println("The middle characters in string " + inputString + ", are: '" + leftMiddleChar + "' '" + rightMiddleChar + "'");
        } else {
            // odd-length string
            char middleChar = inputString.charAt(lengthOfString / 2);
            System.out.println("The middle character in string " + inputString + " is: '" + middleChar + "'");
        }
    }
}
