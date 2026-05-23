package part2;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("Enter a number to sum : (0 to exit) ");
            int number = Integer.valueOf(sc.nextLine());
            
            if (number == 0) {
                break;
            } else {
                result = result + number;
                continue;
            }
        }
        String total = String.format("The sum is %d", result);
        System.out.println(total);
        sc.close();
    }
}
