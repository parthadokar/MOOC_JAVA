package part3;

import java.util.Scanner;

public class Av {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String [] pieces = input.split(" ");

            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }
        sc.close();
    }
}
