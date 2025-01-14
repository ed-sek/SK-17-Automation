package lectures.lecture6.exercises;

import java.util.Scanner;

// import the Arraylist class
import java.util.ArrayList;

public class Exercise5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        toDoList();

        sc.close();
    }

    // create interactive to-do app to manage tasks
    static void toDoList() {

        ArrayList<String> currentTaskList = new ArrayList<>();
        ArrayList<String> completedTaskList = new ArrayList<>();

        System.out.println("Hello. This program can create and interact with a to-do list.");

        System.out.println("Let's start by adding your first 3 tasks.\nPlease enter the first task: ");
        currentTaskList.add(sc.nextLine());

        System.out.println("Please enter the second task: ");
        currentTaskList.add(sc.nextLine());

        System.out.println("Please enter the third task: ");
        currentTaskList.add(sc.nextLine());

        int userChoice = 0; // initial declaration

        do {
            System.out.println("|TASK-LIST MENU|\n[1] Add a new task;\n[2] Mark a task as completed;\n[3] Remove completed tasks;\n[4] Display the current task list;\n[5] Display the completed tasks list;\n[6] Exit the program;\nPlease enter your choice from the  menu options now:\n...");
            userChoice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character (\n) after nextInt() to clear the buffer

            switch (userChoice) {
                case 1:
                    System.out.println("Please enter a new task now: ");
                    String newTask = sc.nextLine();
                    currentTaskList.add(newTask);
                    System.out.println("New task added!");
                    break;
                case 2:
                    System.out.println(currentTaskList);
                    System.out.println("Which task would you like to mark as completed? Enter number matching the position: ");
                    int userChoiceCompleted = sc.nextInt();
                    completedTaskList.add(currentTaskList.get(userChoiceCompleted - 1));
                    System.out.println("Task marked as completed: " + currentTaskList.get(userChoiceCompleted - 1));
                    currentTaskList.remove(userChoiceCompleted - 1);
                    break;
                case 3:
                    completedTaskList.clear();
                    System.out.println("All completed tasks cleared.");
                    break;
                case 4:
                    System.out.println("Current task list: " + currentTaskList);
                    break;
                case 5:
                    System.out.println("Current completed task list: " + completedTaskList);
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again: ");
                }
        } while (userChoice != 6);
    }
}
