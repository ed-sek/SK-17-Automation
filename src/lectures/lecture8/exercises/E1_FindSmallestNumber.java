package lectures.lecture8.exercises;

import java.util.Scanner;

public class E1_FindSmallestNumber {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("This program checks which is the smallest among 3 numbers");
        System.out.println("Enter the first number: ");
        int numA = sc.nextInt();
        System.out.println("Enter the second number: ");
        int numB = sc.nextInt();
        System.out.println("Enter the third number: ");
        int numC = sc.nextInt();

        findAndPrintSmallestNumber(numA, numB, numC);

        sc.close();
    }

    // finds the smallest number among 3 provided
    private static void findAndPrintSmallestNumber(int a, int b, int c) {

        int[] numList = {a, b, c};
        int smallestNum = numList[0]; // initialize to first index in array, instead of 0, to handle negative nums

        for (int number : numList) {
            if (number<smallestNum) {
                smallestNum = number;
            }
        } System.out.println("The smallest number is: " + smallestNum );
    }
}
