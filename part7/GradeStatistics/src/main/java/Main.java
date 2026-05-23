import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Array to count frequencies for grades 0 to 5
        int[] gradeCounts = new int[6];

        int totalPoints = 0;
        int passingPoints = 0;
        int passingCount = 0;

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            // Ignore points outside the [0-100] range
            if (input < 0 || input > 100) {
                continue;
            }

            numbers.add(input);
            totalPoints += input;

            // Convert points to grades and track passing scores
            if (input >= 50) {
                passingPoints += input;
                passingCount++;
            }

            if (input < 50) {
                gradeCounts[0]++;
            } else if (input < 60) {
                gradeCounts[1]++;
            } else if (input < 70) {
                gradeCounts[2]++;
            } else if (input < 80) {
                gradeCounts[3]++;
            } else if (input < 90) {
                gradeCounts[4]++;
            } else {
                gradeCounts[5]++;
            }
        }

        // 1. Calculate and print all-points average
        if (numbers.isEmpty()) {
            System.out.println("Point average (all): -");
        } else {
            double averageAll = (double) totalPoints / numbers.size();
            System.out.println("Point average (all): " + averageAll);
        }

        // 2. Calculate and print passing-points average
        if (passingCount == 0) {
            System.out.println("Point average (passing): -");
        } else {
            double averagePassing = (double) passingPoints / passingCount;
            System.out.println("Point average (passing): " + averagePassing);
        }

        // 3. Calculate and print pass percentage
        if (numbers.isEmpty()) {
            System.out.println("Pass percentage: 0.0");
        } else {
            double passPercentage = 100.0 * passingCount / numbers.size();
            System.out.println("Pass percentage: " + passPercentage);
        }

        // 4. Print grade distribution from grade 5 down to 0
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}