import java.util.ArrayList;
import java.util.Scanner;

public class AndreanRezza_todolist {
    private ArrayList<String> todoList;

    public AndreanRezza_todolist() {
        todoList = new ArrayList<>();
    }

    public void addTask(String task) {
        todoList.add(task);
        System.out.println("Task added successfully!");
    }

    public void removeTask(String task) {
        if (todoList.remove(task)) {
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Task not found!");
        }
    }

    public void removeTaskByIndex(int index) {
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void searchTask(String task) {
        if (todoList.contains(task)) {
            System.out.println("Task found: " + task);
        } else {
            System.out.println("Task not found!");
        }
    }

    public void displayTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    public static void main(String[] args) {
        AndreanRezza_todolist app = new AndreanRezza_todolist();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task By Task Name");
            System.out.println("3. Remove Task By Index");
            System.out.println("4. Search Task By Task Name");
            System.out.println("5. Display Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    app.addTask(taskToAdd);
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    app.removeTask(taskToRemove);
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    app.removeTaskByIndex(indexToRemove - 1);
                    break;

                case 4:
                    System.out.print("Enter task to search: ");
                    String taskToSearch = scanner.nextLine();
                    app.searchTask(taskToSearch);
                    break;

                case 5:
                    app.displayTasks();
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
