package lectures.lecture08.exercises;

import java.util.Scanner;

public class E8_CheckIfEven {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a number to check if it is even or not: ");
        int numberToCheck = sc.nextInt();
        boolean numberIsEven = isEven(numberToCheck);

        System.out.println("Is the number " + numberToCheck + " even? : " + numberIsEven);

        sc.close();
    }

    // check if given number is even or not
    static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
