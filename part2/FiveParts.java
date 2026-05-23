package part2;

import java.util.Scanner;

public class FiveParts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Numbers : ");
        int sum = 0;
        int validNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        double averageNumbers = 0;
        
        while (true) {
            int userValue = Integer.valueOf(sc.nextLine());

            if (userValue == -1) {
                System.out.println("thnx. bye");
                break;
            }

            sum += userValue;
            validNumbers++;
            averageNumbers = sum / validNumbers;

            if (userValue % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }

        System.out.println("Sum of all numbers is " + sum);
        System.out.println("Valid Numbers : " + validNumbers);
        System.out.println("Average : " + averageNumbers);
        System.out.println("Even Numbers : " + evenNumbers);
        System.out.println("Odd Numbers : " + oddNumbers );
        sc.close();
    }
}
