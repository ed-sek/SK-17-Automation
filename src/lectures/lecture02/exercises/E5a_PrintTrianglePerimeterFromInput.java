package lectures.lecture02.exercises;

// import a scanner utility
import java.util.Scanner;

public class E5a_PrintTrianglePerimeterFromInput {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        perimeterCustom();

        sc.close(); // close the scanner
    }

    // print the perimeter of triangle with sides taken by input
    public static void perimeterCustom() {
        System.out.println("Hello, \nI can print the perimeter of a triangle when given its three sides.");

        System.out.println("Please enter the first side of the triangle: ");
        int side1 = sc.nextInt();

        System.out.println("Please enter the second side of the triangle: ");
        int side2 = sc.nextInt();

        System.out.println("Please enter the third side of the triangle: ");
        int side3 = sc.nextInt();

        int perim = side1 + side2 + side3;
        System.out.println("The perimeter of the triangle is: " + perim);
    }
}
