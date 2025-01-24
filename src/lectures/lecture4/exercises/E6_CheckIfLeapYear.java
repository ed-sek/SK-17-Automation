package lectures.lecture4.exercises;

// import a scanner utility
import java.util.Scanner;

public class E6_CheckIfLeapYear {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        leapYearProgram();

        sc.close(); // close the scanner
    }

    // check if leap year
    static void leapYearProgram() {
        System.out.println("Please enter a year: ");
        int year = sc.nextInt();

        boolean condition1 = (year % 4 == 0); // must be True
        boolean condition2 = (year % 100 != 0); // must be True, except when condition3 is True
        boolean condition3 = (year % 400 == 0); // can be True

        if ((condition1 && condition2) || condition3) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap Year");
        }
    }
}
