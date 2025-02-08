package lectures.lecture02.exercises;

// import a scanner utility
import java.util.Scanner;

public class E6_ConvertMinutesToYearsAndDays {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        conversionProgram();

        sc.close(); // close the scanner
    }

    // convert minutes into years and days
    public static void conversionProgram() {
        System.out.println("Hello,\nI can convert minutes into years and days.");
        System.out.println("Please the amount of minutes you would like to convert: ");
        int minutes = sc.nextInt();

        int days = minutes / 1440;
        int years = days / 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + (days % 365) + " days.");
    }
}
