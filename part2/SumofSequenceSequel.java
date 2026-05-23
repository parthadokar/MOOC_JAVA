package part2;

import java.util.Scanner;

public class SumofSequenceSequel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number? ");
        int userFirstValue = Integer.valueOf(sc.nextLine());
        System.out.println("Last Number? ");
        int userSecondValue = Integer.valueOf(sc.nextLine());
        System.out.println("------------------------");
        int result = 0;
        for (int i = userFirstValue; i <= userSecondValue; i++) {
            result += i;
        }
        System.out.println(result);
        sc.close();
    }
}
