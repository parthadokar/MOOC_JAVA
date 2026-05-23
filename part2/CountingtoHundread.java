package part2;

import java.util.Scanner;

public class CountingtoHundread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userValue = Integer.valueOf(sc.nextLine());
        int end = 100;
        for (int i = userValue; i < end; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
