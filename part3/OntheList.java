package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OntheList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names: (Empty entry to exit) ");

        while (true) {
            String input = sc.nextLine();
            if (input == "") {
                break;
            } names.add(input);
        }
        
        System.out.println("Search for :");
        String userInput = sc.nextLine();
        
        boolean found = false;
        for (String name : names) {
            if (userInput.equals(name)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(userInput + " was found.");
        } else {
            System.out.println(userInput + " was not found.");
        }
        sc.close();
    }
}
