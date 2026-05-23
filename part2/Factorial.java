package part2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number : ");
        int userValue = Integer.valueOf(sc.nextLine());
        int result = 1;
        for (int i = 1; i <= userValue; i++) {
            result *= i;
        }
        System.out.println(result);
        sc.close();
    }
}
