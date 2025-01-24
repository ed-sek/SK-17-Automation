package lectures.lecture4.exercises;

// import a scanner utility
import java.util.Scanner;

public class E2_PrintDayOfTheWeek {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        dayOfTheWeekProgram();

        sc.close(); // close the scanner
    }

    // print day of the week corresponding to input
    static void dayOfTheWeekProgram() {
        System.out.println("Please input a whole digit between 1-7 as your day of choice: ");
        int dayOfTheWeek = sc.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("The " + dayOfTheWeek + "-st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + dayOfTheWeek + "-nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + dayOfTheWeek + "-rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The " + dayOfTheWeek + "-th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The " + dayOfTheWeek + "-th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + dayOfTheWeek + "-th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + dayOfTheWeek + "-th day of the week is Sunday.");
                break;
            default:
                System.out.println("Program condition not followed: Please provide a whole digit between 1-7.");
                break;
        }
    }
}
