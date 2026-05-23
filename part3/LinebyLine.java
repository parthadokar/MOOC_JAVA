package part3;

import java.util.Scanner;

public class LinebyLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter string: ");
            String userInput = sc.nextLine();

            if (userInput.isEmpty()) break;

            String[] answer = userInput.split(" ");

            for (int i = 0; i < answer.length; i++) {
                System.out.println(answer[i]);
            }
        }
        sc.close();
    }
}
