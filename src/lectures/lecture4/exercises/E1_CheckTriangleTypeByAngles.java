package lectures.lecture4.exercises;

// import a scanner utility
import java.util.Scanner;

public class E1_CheckTriangleTypeByAngles {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        triangleProgram();

        sc.close(); // close the scanner
    }

    // check if triangle can be built by input angles, if yes output type
    static void triangleProgram() {

        System.out.println("Hello, I can calculate if a triangle can be built by 3 given angles.");

        System.out.println("Please provide the first angle value: ");
        int firstAngle = sc.nextInt();

        System.out.println("Please provide the second angle value: ");
        int secondAngle = sc.nextInt();

        System.out.println("Please provide the third angle value: ");
        int thirdAngle = sc.nextInt();

        // Check if the sum of the angles is 180
        if (firstAngle + secondAngle + thirdAngle != 180) {
            System.out.println("A triangle can't be built with the given angle values.");
        } else {
            // Check for specific triangle types
            if (firstAngle == 60 && secondAngle == 60 && thirdAngle == 60) {
                System.out.println("The given triangle is equilateral.");
            } else if (firstAngle < 90 && secondAngle < 90 && thirdAngle < 90) {
                System.out.println("The given triangle is acute.");
            } else if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
                System.out.println("The given triangle is right-angled.");
            } else if (firstAngle > 90 || secondAngle > 90 || thirdAngle > 90) {
                System.out.println("The given triangle is obtuse.");
            } else if (firstAngle == secondAngle || firstAngle == thirdAngle || secondAngle == thirdAngle) {
                System.out.println("The given triangle is isosceles.");
            } else {
                System.out.println("The given triangle is scalene.");
            }
        }
    }
}
