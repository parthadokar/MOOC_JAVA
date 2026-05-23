package part3;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input (csv form)");
        String inputString = sc.nextLine();
        String[] pieces = inputString.split(" ");
        int lastIndex = pieces.length - 1;
        System.out.println(pieces[lastIndex]);
        sc.close();
    }
}
