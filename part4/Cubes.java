package part4;

import java.util.ArrayList;
import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (end stops the program)");
        while (true) {
            String userInput = sc.nextLine();

            if (userInput.equals("end")) {
                break;
            }
            int number = Integer.valueOf(userInput);
            int result = (number * number * number);
            System.out.println(result);
        }
    }
}
