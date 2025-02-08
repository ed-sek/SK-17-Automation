package lectures.lecture08.exercises;

import java.util.Scanner;

public class E9_CheckIfNumberPalindrome {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a non-negative number to check if it is a palindrome: ");
        int numberToCheck = sc.nextInt();

        boolean isPalindrome = isNumberPalindrome(numberToCheck);
        System.out.println("Is the number " + numberToCheck + " a palindrome? : " + isPalindrome);

        sc.close();
    }

    // check if a given number is a palindrome
    static boolean isNumberPalindrome(int number) {

        // convert the number to a string
        String numberToCheckAsString = Integer.toString(number);

        // use two pointers to compare characters from both ends moving-in
        int left = 0;
        int right = numberToCheckAsString.length() - 1;

        while (left < right) {
            // if the elements don't match it is not a palindrome
            if (numberToCheckAsString.charAt(left) != numberToCheckAsString.charAt(right)) {
                return false;
            }
            // moving the pointers closer to the middle
            left++;
            right--;
        }
        // if the pointers reach the middle without mismatch the number is a palindrome
        return true;
    }
}
