package part2;

import java.util.Scanner;

public class SumofSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Last Number? ");
        int result = 0;
        int userValue = Integer.valueOf(sc.nextLine());
        for (int i = 0; i <= userValue; i++) {
            result += i;
        }
        System.out.println(result);
        sc.close();
    }
}
