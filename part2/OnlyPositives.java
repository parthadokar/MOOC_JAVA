package part2;

import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = Integer.valueOf(sc.nextLine());
            
            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Unsutiable Number");
                continue;
            }
            System.out.println(number * number);
        }
        System.out.println("Thank you.");
        sc.close();
    }
}
