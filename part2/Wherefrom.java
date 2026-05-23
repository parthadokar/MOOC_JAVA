package part2;

import java.util.Scanner;

public class Wherefrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where to ? ");
        int userFirstValue = Integer.valueOf(sc.nextLine());
        System.out.println("Where from?");
        int userSecondValue = Integer.valueOf(sc.nextLine());
        System.out.println("-------------------------");
        for (int i = userSecondValue; i <= userFirstValue; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
