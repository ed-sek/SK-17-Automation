package lectures.lecture6.exercises;

import java.util.Scanner;

// import the Arraylist class
import java.util.ArrayList;

public class E5_ToDoListApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        toDoList();

        sc.close();
    }

    // create interactive to-do app to manage tasks
    static void toDoList() {

        ArrayList<String> currentTaskList = new ArrayList<>();
        ArrayList<String> completedTaskList = new ArrayList<>();

        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\n|TASK-LIST MENU|");
            System.out.println("[1] Add a new task;");
            System.out.println("[2] Mark a task as completed");
            System.out.println("[3] Remove completed tasks;");
            System.out.println("[4] Display the current task list;");
            System.out.println("[5] Display the completed tasks list;");
            System.out.println("[6] Exit the program;");
            System.out.println("Please enter your choice from the menu options now: ");


            int userChoice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character (\n) after nextInt() to clear the buffer
            switch (userChoice) {
                case 1:
                    System.out.println("Please enter a new task now: ");
                    String newTask = sc.nextLine();
                    currentTaskList.add(newTask);
                    System.out.println("New task added!");
                    break;
                case 2:
                    System.out.println("Which task would you like to mark as completed from your current tasks? Enter number matching the position: " + currentTaskList);
                    int userChoiceCompleted = sc.nextInt();
                    completedTaskList.add(currentTaskList.get(userChoiceCompleted - 1));
                    System.out.println("Task marked as completed: " + currentTaskList.get(userChoiceCompleted - 1));
                    currentTaskList.remove(userChoiceCompleted - 1);
                    break;
                case 3:
                    if (currentTaskList.isEmpty()) {
                        System.out.println("The completed task list is empty. Please complete some tasks first and try again.");
                    } else {
                        completedTaskList.clear();
                        System.out.println("All completed tasks cleared.");
                    }
                    break;
                case 4:
                    if (currentTaskList.isEmpty()) {
                        System.out.println("The current task list is empty. Please add some tasks first and try again.");
                    } else {
                        System.out.println("Current task list: " + currentTaskList);
                    }
                    break;
                case 5:
                    if (completedTaskList.isEmpty()) {
                        System.out.println("The completed task list is empty. Please complete some tasks first and try again.");
                    } else {
                        System.out.println("Current completed task list: " + completedTaskList);
                    }
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again: ");
            }
        }
    }
}
