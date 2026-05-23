package part3;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input (csv form)");
        String inputString = sc.nextLine();
        String[] pieces = inputString.split(",");
        System.out.println(pieces[0]);
        sc.close();
    }
}
