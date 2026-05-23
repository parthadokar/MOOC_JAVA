package part3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        System.out.println("Enter first swap value");
        int userFirstInput = Integer.valueOf(sc.nextLine());
        System.out.println("Enter second value");
        int userSecondInput = Integer.valueOf(sc.nextLine());

        // Swap Values
        int temp = numbers[userFirstInput];
        numbers[userFirstInput] = numbers[userSecondInput];
        numbers[userSecondInput] = temp;
        System.out.println("");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        sc.close();
    }
}
