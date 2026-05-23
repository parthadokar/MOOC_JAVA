package part2;

import java.util.Scanner;

public class Whereto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where to ?");
        int userValue = Integer.valueOf(sc.nextLine());
        for (int i = 0; i <= userValue; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
