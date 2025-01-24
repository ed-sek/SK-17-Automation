package lectures.lecture8.exercises;

import java.util.Scanner;

public class E2_ComputeAverageOfThreeNumbers {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("This program computes the average of three numbers.");
        System.out.println("Enter the first number: ");
        double numA = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double numB = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double numC = sc.nextDouble();

        computeAverageNumber(numA, numB, numC);

        sc.close();
    }

    // compute the average of three numbers
    private static void computeAverageNumber(double a, double b, double c) {

        double total = (a+b+c) / 3;
        if (total % 1 == 0) {
            System.out.println("The average is: " + (int) total); // cast to int for legibility
        } else {
            System.out.println("The average is: " + total);
        }
    }
}
