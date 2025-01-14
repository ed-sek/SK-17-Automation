package lectures.lecture6.exercises;

import java.util.Scanner;

// import the LinkedList class
import java.util.LinkedList;

// import the Queue class
import java.util.Queue;

public class Exercise7_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        coffeeShopQueue();

        sc.close();
    }

    // managing a coffee shop queue
    static void coffeeShopQueue() {

        Queue<String> cofeeShopQueue = new LinkedList<>();

        int userMenuChoice = 0;
        do {
            System.out.println("|QUEUE MENU|\n[1] Add a new customer to the queue;\n[2] Remove a customer from the queue;\n[3] View the current line of the queue;\n[4] Exit the program;\nPlease enter your choice from menu items above: \n...");
            userMenuChoice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character (\n) after nextInt() to clear the buffer

            switch (userMenuChoice) {
                case 1:
                    System.out.println("Please add a new customer to the queue: ");
                    cofeeShopQueue.add(sc.nextLine());
                    System.out.println("New customer added to the queue");
                    break;
                case 2:
                    System.out.println("The first customer got served and is removed. This is: " + cofeeShopQueue.peek());
                    cofeeShopQueue.poll();
                    break;
                case 3:
                    System.out.println("This is the current queue status: " + cofeeShopQueue);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again: ");
            }
        } while (userMenuChoice != 4);
    }
}
