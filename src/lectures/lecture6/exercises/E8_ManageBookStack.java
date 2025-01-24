package lectures.lecture6.exercises;

import java.util.Scanner;

// import the Stack class
import java.util.Stack;

public class E8_ManageBookStack {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        bookStack();

        sc.close();
    }

    // managing a stack of books
    static void bookStack() {

        Stack<String> bookStack = new Stack<>();

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\n|STACK-BOOK MENU|");
            System.out.println("[1] Add a book to the stack;");
            System.out.println("[2] View the top book;");
            System.out.println("[3] Remove book from the stack;");
            System.out.println("[4] Exit the program;");
            System.out.println("Please choose from the options above...");

            int userChoice = sc.nextInt();
            sc.nextLine(); // clear the buffer of the next line character \n
            switch (userChoice) {
                case 1:
                    System.out.println("Please type the name of the book you want to add: ");
                    String newBook = sc.nextLine();
                    System.out.println("New book added to the stack: " + bookStack.push(newBook));
                    break;
                case 2:
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is empty. Please add some books to populate it first.");
                    } else {
                        System.out.println("The top book is: " + bookStack.peek());
                    }
                    break;
                case 3:
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is empty. Please add some books to populate it first.");
                    } else {
                        System.out.println("The removed book on top of the stack is: " + bookStack.pop());
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
