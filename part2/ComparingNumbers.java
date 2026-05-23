package part2;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = Integer.valueOf(sc.nextLine());
        int number2 = Integer.valueOf(sc.nextLine());
        if (number1 > number2) {
            String result = String.format("%d is bigger than %d", number1, number2);
            System.out.println(result);
        } else if (number1 == number2) {
            String result = String.format("%d is equal to %d", number1, number2);
            System.out.println(result);
        } else {
            String result = String.format("%d is bigger than %d", number2, number1);
            System.out.println(result);
        }
        sc.close();
    }
}
