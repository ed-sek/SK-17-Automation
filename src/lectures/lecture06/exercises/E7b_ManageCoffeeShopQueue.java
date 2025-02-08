package lectures.lecture06.exercises;

import java.util.Scanner;

// import the LinkedList class
import java.util.LinkedList;

// import the Queue class
import java.util.Queue;

public class E7b_ManageCoffeeShopQueue {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        coffeeShopQueue();

        sc.close();
    }

    // managing a coffee shop queue
    static void coffeeShopQueue() {

        Queue<String> cofeeShopQueue = new LinkedList<>();

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\n|QUEUE MENU|");
            System.out.println("[1] Add a new customer to the queue;");
            System.out.println("[2] Remove a customer from the queue;");
            System.out.println("[3] View the current line of the queue;");
            System.out.println("[4] Exit the program;");
            System.out.println("Please enter your choice from menu items above: ");

            int userChoice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character (\n) after nextInt() to clear the buffer
            switch (userChoice) {
                case 1:
                    System.out.println("Please add a new customer to the queue: ");
                    String newCustomer = sc.nextLine();
                    cofeeShopQueue.add(newCustomer);
                    System.out.println("New customer added to the queue: " + newCustomer);
                    break;
                case 2:
                    if (cofeeShopQueue.isEmpty()) {
                        System.out.println("There are no customers in queue at the moment. Please add some customers and try again.");
                    } else {
                        System.out.println("The first customer in line got served and is removed. This is: " + cofeeShopQueue.poll());
                    }
                    break;
                case 3:
                    if (cofeeShopQueue.isEmpty()) {
                        System.out.println("There are no customers in queue at the moment. Please add some customers and try again.");
                    } else {
                        System.out.println("This is the current queue status: " + cofeeShopQueue);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again: ");
            }
        }
    }
}
