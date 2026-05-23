package part2;

import java.util.Scanner;

public class NumberRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberRead = 0;
        int sum = 0;
        while (true) {
            if (numberRead == 5) {
                break;
            }
            System.out.println("Input Number: ");
            sum = sum + Integer.valueOf(sc.nextLine());
            numberRead = numberRead + 1;
        }
        sc.close();
        System.out.println("The sum of numbers is " + sum);
    }
}
