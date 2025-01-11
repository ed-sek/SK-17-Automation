package lectures.lecture4.exercises;

// import a scanner utility
import java.util.Scanner;

public class Exercise4 {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        revenueProgram();

        sc.close(); // close the scanner
    }

    // calculate the revenue from a sale while applying discount
    static void revenueProgram() {
        System.out.println("Please enter the unit's price: ");
        float unitPrice = sc.nextFloat();

        System.out.println("Please enter the unit's quantity: ");
        float unitQuantity = sc.nextFloat();

        float revenue = unitPrice * unitQuantity;

        if (unitQuantity >= 100 && unitQuantity <= 120) {
            System.out.println("The revenue from the sale is: " + (revenue * 0.85) + '$' + "\nDiscount: " + (revenue * 0.15) + "$(15%)");
        } else if (unitQuantity > 120) {
            System.out.println("The revenue from the sale is: " + (revenue * 0.8) + '$' + "\nDiscount: " + (revenue * 0.2) + "$(20%)");
        } else {
            System.out.println("The revenue from sale is: " + revenue + '$' + "\nDiscount: 0$");
        }
    }
}
