package part2;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int number = Integer.valueOf(sc.nextLine());
    if (number < 0) {
        int answer = number * -1 ;
        System.out.println(answer);
    } else {
        System.out.println(number);
    }
    sc.close();
    }
}
