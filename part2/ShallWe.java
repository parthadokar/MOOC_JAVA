package part2;

import java.util.Scanner;

public class ShallWe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Exit (no)");
            String input = String.valueOf(sc.nextLine());
            if (input.contains("no")) {
                break;
            }
            System.out.println("Shall we carry on?");
        }
        System.out.println("Ready");
        sc.close();
    }
}
