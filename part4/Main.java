package part4;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        System.out.println("Enter a number (-1 to exit)");
        while (true) {
            int userInput = Integer.valueOf(sc.nextLine());

            // Total Sum
            if (userInput == -1) {
                break;
            }

            // Even and Odd Sum
            if (userInput % 2 == 0) {
                evenStatistics.addNumber(userInput);
            } else {
                oddStatistics.addNumber(userInput);
            }
            statistics.addNumber(userInput);
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Even Sum: " + evenStatistics.sum());
        System.out.println("Odd Sum: " + oddStatistics.sum());
        // System.out.println("Average: " + statistics.average());
        // System.out.println("Count: " + statistics.getCount());
    }
}
