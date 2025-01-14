package lectures.lecture6.exercises;

import java.util.Scanner;

// import the ArrayList class
import java.util.ArrayList;

// import the Random class
import java.util.Random;

public class Exercise6 {

    static Scanner sc = new Scanner(System.in);

    static Random randomNumGenerator = new Random();

    public static void main(String[] args){

        lotteryNumbers();

        sc.close();
    }

    // add lottery numbers and check if there is a winner
    static void lotteryNumbers() {

        ArrayList<Integer> userLotteryNumbers = new ArrayList<>();
        ArrayList<Integer> winningLotteryNumbers = new ArrayList<>();

        // filling the ArrayList with 6 random numbers
        for (int i = 0; i<6; i++) {
            winningLotteryNumbers.add(randomNumGenerator.nextInt(49)+1); // the +1 shifts the entire range up by one so it is 1-49
        }

        System.out.println("Please input your guesses for the winning numbers. Range is between 1-49: ");
        for (int i = 0; i < 6; i++) {
            userLotteryNumbers.add(sc.nextInt());
            System.out.println("Number recorded. Numbers to add remaining: " + (5-i));
        }

        int userMenuChoice = 0;
        do {
            System.out.println("|LOTTERY-NUMBERS MENU|\n[1] Check if a given number is a winning number;\n[2] View all winning numbers;\n[3] Exit the program;\nPlease enter your choice from menu items above: \n...");
            userMenuChoice = sc.nextInt();

            switch (userMenuChoice) {
                case 1:
                    System.out.println("These are your lottery number guesses currently: " + userLotteryNumbers);
                    System.out.println("Please select the position of the number you want to check: ");
                    int userCheckNumber = userLotteryNumbers.get(sc.nextInt()-1);

                    if (winningLotteryNumbers.contains(userCheckNumber)) {
                        System.out.println("Congratulations!!!\n" + userCheckNumber + " is a winning number.");
                    } else {
                        System.out.println("Sorry! The number: " + userCheckNumber + " is not a winning number.");
                    }
                    break;
                case 2:
                    System.out.println("The winning numbers are: " + winningLotteryNumbers);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        } while (userMenuChoice != 3);
    }
}
