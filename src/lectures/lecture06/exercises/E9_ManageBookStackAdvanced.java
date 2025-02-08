package lectures.lecture06.exercises;

import java.util.Scanner;

// import the Stack class
import java.util.Stack;

public class E9_ManageBookStackAdvanced {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        bookStackAdvanced();

        sc.close();
    }

    // managing a stack of books, advanced operations
    static void bookStackAdvanced() {

        Stack<String> bookStack = new Stack<>();

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\n|STACK-BOOK MENU 2.0|");
            System.out.println("[1] Add a book to the stack;");
            System.out.println("[2] Search for a book by title and retrieve it;");
            System.out.println("[3] Print the remaining books in the stack;");
            System.out.println("[4] Exit the program;");
            System.out.println("Please choose from the options above...");

            int userChoice = sc.nextInt();
            sc.nextLine(); // clear the buffer of the next line character \n
            switch (userChoice) {
                case 1:
                    if (bookStack.size() == 5) {
                        System.out.println("Stack max size: " + bookStack.size() + " reached. Please remove some books and try again.");
                    } else {
                        System.out.println("Please type the name of the book you want to add: ");
                        String newBook = sc.nextLine();
                        System.out.println("New book added to the stack: " + bookStack.push(newBook));
                        System.out.println("Remaining slots to maximum stack size(5): " + (5 - bookStack.size()));
                    }
                    break;
                case 2:
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is empty. Please add some books to populate it first and try again.");
                    } else {
                        System.out.println("Please type the exact title of the book you want to retrieve: ");
                        String retrieveBook = sc.nextLine();
                        // returns true if the book is found and removed
                        if (bookStack.remove(retrieveBook)) {
                            System.out.println("The book is retrieved: " + retrieveBook);
                        } else {
                            System.out.println("No book was retrieved. Please try again");
                        }
                    }
                    break;
                case 3:
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is empty. Please add some books to populate it first and try again.");
                    } else {
                        System.out.println("The remaining books are: " + bookStack);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from the given options.");
            }
        }
    }
}
