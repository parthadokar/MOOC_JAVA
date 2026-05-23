package part2;

import java.util.Scanner;

public class NumberofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs = 0;
        while (true) {
            System.out.println("Enter a number (0 to exit)");
            int number = Integer.valueOf(sc.nextLine());
            
            if (number == 0) {
                break;
            }

            if (number > 0) {
                inputs = inputs + 1;
                continue;
            }
        }
        String result = String.format("Number of numbers : %d", inputs);
        System.out.println(result);
        sc.close();
    }
}
