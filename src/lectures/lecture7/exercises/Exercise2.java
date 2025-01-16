package lectures.lecture7.exercises;

import java.util.Scanner;

// import the HashSet class
import java.util.HashSet;


public class Exercise2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        uniqueGuestList();

        sc.close();
    }

    // manage unique guests list to a party
    static void uniqueGuestList() {

        HashSet<String> guestList = new HashSet<>();

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\n|GUEST-LIST MENU|");
            System.out.println("[1] Add a guest to the guest list");
            System.out.println("[2] Try adding a duplicate guest name to the guest list");
            System.out.println("[3] Remove a guest from the list");
            System.out.println("[4] Check if a specific guest is on the guest list");
            System.out.println("[5] Print all the guests' names on the list");
            System.out.println("[6] Exit the program");
            System.out.print("Please choose from the options above: ");

            int userChoice = sc.nextInt();
            sc.nextLine(); // clear the buffer

            switch (userChoice) {
                case 1:
                    System.out.println("Please type the name of the guest you wish to add: ");
                    String newGuest = sc.nextLine();
                    if (guestList.add(newGuest)) {
                        System.out.println("New guest added: " + newGuest);
                    } else {
                        System.out.println("Looks like " + newGuest + " is already on the list. Please try again with a different name.");
                    }
                    break;
                case 2:
                    System.out.println("Please type the name of the guest to duplicate: ");
                    String duplicateGuest = sc.nextLine();

                    if (!guestList.add(duplicateGuest)) {
                        System.out.println("Guest name already exists on the list. Duplicates not allowed.");
                    } else {
                        System.out.println("The guest name was not on the list. New guest was added:  " + duplicateGuest);
                    }
                    break;
                case 3:
                    if (guestList.isEmpty()) {
                        System.out.println("Guest list is currently empty. Please add some guests first and try again.");
                        break;
                    }
                    System.out.println("Please type the name of the guest to remove: ");
                    String removeGuest = sc.nextLine();
                    if (guestList.remove(removeGuest)) {
                        System.out.println("Guest has been removed: " + removeGuest);
                    } else {
                        System.out.println("Guest: " + removeGuest + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Please type the name of the guest you wish to check: ");
                    String guestPresence = sc.nextLine();

                    if (guestList.contains(guestPresence)) {
                        System.out.println("Guest: " + guestPresence + " is present on the list.");
                    } else {
                        System.out.println("Guest: " + guestPresence + " is not on the list.");
                    }
                    break;
                case 5:
                    if (guestList.isEmpty()) {
                        System.out.println("Guest list is currently empty. Please add some guests first and try again.");
                    } else {
                        System.out.println("The current list is: ");
                        for (String guest : guestList) {
                            System.out.println("- " + guest);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from the given options: ");
            }
        }
    }
}
