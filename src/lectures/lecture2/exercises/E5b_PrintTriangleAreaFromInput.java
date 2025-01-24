package lectures.lecture2.exercises;

// import a scanner utility
import java.util.Scanner;

public class E5b_PrintTriangleAreaFromInput {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        areaCustom();

        sc.close(); // close the scanner
    }

    // print the area of a triangle with sides taken by input
    public static void areaCustom() {
        System.out.println("Hello, \nI can print the area of a right-angled triangle when given its base and height sides.");

        System.out.println("Please enter the base: ");
        int sideBase = sc.nextInt();

        System.out.println("Please enter the height: ");
        int sideHeight = sc.nextInt();

        int area = (sideBase * sideHeight) / 2;
        System.out.println("The area of the triangle is: " + area);
    }
}
