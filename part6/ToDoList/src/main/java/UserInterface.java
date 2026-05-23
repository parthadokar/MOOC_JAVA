import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start () {
        while (true) {
            System.out.println("Command :");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String addTodo = scanner.nextLine();
                todoList.add(addTodo);
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                Integer removeTodo = Integer.valueOf(scanner.nextInt());
                todoList.remove(removeTodo);
                System.out.println("Removed");
            } else if (command.equals("list")) {
                todoList.print();
            }
        }
    }
}
