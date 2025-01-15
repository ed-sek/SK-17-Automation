package lectures.lecture6.exercises;

import java.util.Scanner;

// import the LinkedList class
import java.util.LinkedList;

public class Exercise7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        contactList();

        sc.close();
    }

    // create a contact list to add,view and remove contacts
    static void contactList() {

        LinkedList<String> contactList = new LinkedList<>();

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\n|CONTACT-LIST MENU|");
            System.out.println("[1] Add a contact to the list;");
            System.out.println("[2] View the contact list;");
            System.out.println("[3] Remove a contact from the list;");
            System.out.println("[4] Exit the program;");
            System.out.println("Please enter your choice from menu items above: ");

            int userChoice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character (\n) after nextInt() to clear the buffer
            switch (userChoice) {
                case 1:
                    System.out.println("Please add your new contact's names: ");
                    String newContact = sc.nextLine();
                    contactList.add(newContact);
                    System.out.println("New contact entry added: " + newContact);
                    break;
                case 2:
                    if (contactList.isEmpty()) {
                        System.out.println("Your contact list is empty. Please add some contacts and try again.");
                    } else {
                        System.out.println("The current contact list is: " + contactList);
                    }
                    break;
                case 3:
                    if (contactList.isEmpty()) {
                        System.out.println("Your contact list is empty. Please add some contacts and try again");
                    } else {
                        System.out.println(contactList);
                        System.out.println("Which contact would you like to remove? Type the position.");
                        int removedContact = sc.nextInt();
                        System.out.println("Contact removed: " + contactList.remove(removedContact-1));
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
