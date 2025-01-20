package lectures.lecture8;

import java.util.Scanner;

public class Exercise4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a string to find the count of words in it: ");
        String stringToCheck = sc.nextLine();

        findNumberOfWordsInString(stringToCheck);

        sc.close();
    }

    // finding the word count in a string
    static void findNumberOfWordsInString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            System.out.println("Invalid input: The string cannot be null or empty. Please provide a valid string.");
            return; // exit the method prematurely
        }

        // finding the spaces in the string
        int spacesCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                spacesCount++;
            }
        }
        int wordsInTheString = spacesCount+1;
        System.out.println("The number of words in string \"" + inputString + "\" is: " + wordsInTheString);
    }
}
