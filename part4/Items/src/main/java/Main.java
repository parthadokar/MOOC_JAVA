import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        System.out.println("Enter Item name (empty will exit)");
        while (true) {
            String userInput = sc.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            items.add(new Item(userInput));
        }
        System.out.println();
        System.out.println("Item in total : " + items.size());
        System.out.println("Items : ");

        for (Item item : items) {
            System.out.println(item);
        }
        sc.close();
    }
}
