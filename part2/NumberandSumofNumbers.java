package part2;

import java.util.Scanner;

public class NumberandSumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int totalNumbers = 0;

        while (true) {
            System.out.println("Enter a number to sum : (0 to exit) ");
            int number = Integer.valueOf(sc.nextLine());
            
            if (number == 0) {
                break;
            } else {
                result = result + number;
                totalNumbers = totalNumbers + 1;
                continue;
            }
        }
        String total = String.format("The sum is %d", result);
        String totalNumberCount  = String.format("Total numbers of numbers %d", totalNumbers);
        System.out.println(total);
        System.out.println(totalNumberCount);
        sc.close();
    }
}
