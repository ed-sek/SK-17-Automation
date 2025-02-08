package lectures.lecture04.exercises;

// import a scanner utility
import java.util.Scanner;

public class E3_CheckEligibilityToWork {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        eligibleToWorkProgram();

        sc.close(); // close the scanner
    }

    // check if eligible to work
    static void eligibleToWorkProgram() {
        System.out.println("Please input your age: ");
        int userAge = sc.nextInt();

        if (userAge >= 16) {
            System.out.println("User is eligible to work.");
        } else {
            System.out.println("User is ineligible to work.");
        }
    }
}
