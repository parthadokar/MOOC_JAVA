package part2;

import java.util.Scanner;

public class Hole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times?");
        int userValue = Integer.valueOf(sc.nextLine());
        System.out.println("====================");
        printUntilNumber(userValue);
        sc.close();
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
