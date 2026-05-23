package part3;

import java.util.Scanner;

public class IsitTrue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = "true";
        while (true) {
            System.out.print("Give a string: ");
            String input = sc.nextLine();

            if (!input.contains(text)) {
                System.out.println("Try again.");
            } else {
                System.out.println("You got it right.");
                break;
            }
        }
        sc.close();
    }
}
