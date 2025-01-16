package lectures.lecture7.exercises;

import java.util.Scanner;

// import the HashMap class
import java.util.HashMap;

public class Exercise1 {

    static Scanner sc = new Scanner(System.in);

    // defining constants for repeated use
    private static final String NO_PRODUCTS_IN_INVENTORY_MESSAGE = "There are no products currently in the inventory. Please add some and try again.";
    private static final String IS_NOT_IN_INVENTORY_MESSAGE = " is not in inventory.";

    public static void main(String[] args) {

        storeInventory();

        sc.close();
    }

    // track inventory in a store
    static void storeInventory() {

        HashMap<String, Integer> storeInventory = new HashMap<>();

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\n|STORE-INVENTORY MENU|");
            System.out.println("[1] Add a product with quantity to inventory");
            System.out.println("[2] Check the quantity of a specific product");
            System.out.println("[3] Restock a product");
            System.out.println("[4] Mark a product as out of stock");
            System.out.println("[5] Remove a product from inventory");
            System.out.println("[6] Print the entire inventory");
            System.out.println("[7] Exit the program");
            System.out.print("Please choose from the options above: ");

            int userChoice = sc.nextInt();
            sc.nextLine(); // clear the buffer

            switch (userChoice) {
                case 1:
                    System.out.println("Please type the name of the product to be added: ");
                    String newProduct = sc.nextLine();
                    System.out.println("Please type the quantity of product: " + newProduct);
                    int newProductQty = sc.nextInt();
                    storeInventory.put(newProduct, newProductQty);
                    break;
                case 2:
                    if (storeInventory.isEmpty()) {
                        System.out.println(NO_PRODUCTS_IN_INVENTORY_MESSAGE);
                        break;
                    }

                    System.out.println("Please type the name of the product you wish to check: ");
                    String checkedProduct = sc.nextLine();
                    if (storeInventory.containsKey(checkedProduct)) {
                        System.out.println("The current quantity of " + checkedProduct + " is: " + storeInventory.get(checkedProduct));
                    } else {
                        System.out.println(checkedProduct + IS_NOT_IN_INVENTORY_MESSAGE);
                    }
                    break;
                case 3:
                    if (storeInventory.isEmpty()) {
                        System.out.println(NO_PRODUCTS_IN_INVENTORY_MESSAGE);
                        break;
                    }

                    System.out.println("Please type the name of the product to be restocked: ");
                    String restockProduct = sc.nextLine();
                    if (storeInventory.containsKey(restockProduct)) {
                        System.out.println("Please type the additional quantity of " + restockProduct + " to be added: ");
                        int restockProductQty = sc.nextInt();
                        storeInventory.replace(restockProduct, (storeInventory.get(restockProduct) + restockProductQty));
                        System.out.println(restockProduct + " is now restocked. The new quantity is: " + storeInventory.get(restockProduct));
                    } else {
                        System.out.println(restockProduct + IS_NOT_IN_INVENTORY_MESSAGE);
                    }
                    break;
                case 4:
                    if (storeInventory.isEmpty()) {
                        System.out.println(NO_PRODUCTS_IN_INVENTORY_MESSAGE);
                        break;
                    }

                    System.out.println("Please type the name of the product to be marked as out of stock: ");
                    String markOutOfStock = sc.nextLine();
                    if (storeInventory.containsKey(markOutOfStock)) {
                        storeInventory.replace(markOutOfStock, 0);
                        System.out.println(markOutOfStock + " is now marked out of stock.");
                    } else {
                        System.out.println(markOutOfStock + IS_NOT_IN_INVENTORY_MESSAGE);
                    }
                    break;
                case 5:
                    if (storeInventory.isEmpty()) {
                        System.out.println(NO_PRODUCTS_IN_INVENTORY_MESSAGE);
                        break;
                    }

                    System.out.println("Please type the name of the product to remove from inventory: ");
                    String removedProduct = sc.nextLine();
                    if (storeInventory.containsKey(removedProduct)) {
                        storeInventory.remove(removedProduct);
                        System.out.println(removedProduct + " is now removed.");
                    } else {
                        System.out.println(removedProduct + IS_NOT_IN_INVENTORY_MESSAGE);
                    }
                    break;
                case 6:
                    if (storeInventory.isEmpty()) {
                        System.out.println(NO_PRODUCTS_IN_INVENTORY_MESSAGE);
                    } else {
                        System.out.println(storeInventory);
                    }
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from the given options: ");
            }
        }
    }
}
