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

        int userMenuChoice = 0;
        do {
            System.out.println("|CONTACT-LIST MENU|\n[1] Add a contact to the list;\n[2] View the contact list\n[3] Remove a contact from the list;\n[4] Exit the program;\nPlease enter your choice from menu items above: \n...");
            userMenuChoice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character (\n) after nextInt() to clear the buffer

            switch (userMenuChoice){
                case 1:
                    System.out.println("This is your Contact list currently: " + contactList);
                    System.out.println("Please add your new contact's names: ");
                    contactList.add(sc.nextLine());
                    System.out.println("New contact added.");
                    break;
                case 2:
                    System.out.println("The current contact list is: " + contactList);
                    break;
                case 3:
                    System.out.println(contactList);
                    System.out.println("Which contact would you like to remove?");
                    contactList.remove(sc.nextLine());
                    System.out.println("Contact removed.");
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
