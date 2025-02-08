package lectures.lecture08.exercises;

import java.util.Scanner;

public class E7_DisplayLastCharacterOfString {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a string to find its last character: ");
        String stringToCheck = sc.nextLine();

        char lastCharacterInString = displayLastCharacterOfString(stringToCheck);
        System.out.println("The last character in string \"" + stringToCheck + "\" is: '" + lastCharacterInString + "'");

        sc.close();
    }

    // return the last character of a string given by input
    static char displayLastCharacterOfString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            System.out.println("String is empty: no last character found.");
            return ' '; // display empty char and exit the method prematurely
        }
        int lastCharacterIndex = inputString.length() - 1;

        return inputString.charAt(lastCharacterIndex);
    }
}
