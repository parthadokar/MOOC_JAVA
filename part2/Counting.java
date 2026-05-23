package part2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int userValue = Integer.valueOf(sc.nextLine());
        for (int i = start; i < userValue; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
