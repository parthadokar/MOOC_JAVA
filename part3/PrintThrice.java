package part3;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        System.out.println(input+input+input);
        sc.close();
    }
}
