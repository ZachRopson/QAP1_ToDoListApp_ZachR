
package com.todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Show Tasks");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter task title:");
                    String title = scanner.nextLine();
                    toDoList.addTask(title);
                    break;
                case 2:
                    System.out.println("Enter task number to remove:");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.println("Enter task number to mark complete:");
                    int completeIndex = scanner.nextInt() - 1;
                    toDoList.markTaskComplete(completeIndex);
                    break;
                case 4:
                    System.out.println("Your To-Do List:");
                    System.out.println(toDoList);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
