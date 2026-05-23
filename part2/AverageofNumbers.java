package part2;

import java.util.Scanner;

public class AverageofNumbers {
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

        if (totalNumbers > 0) {
            int averageNumbers = result / totalNumbers;
            String averageNumbersPrint = String.format("Avearge of numbers : %d", averageNumbers);
            System.out.println(averageNumbersPrint);
        }

        sc.close();
    }
}
