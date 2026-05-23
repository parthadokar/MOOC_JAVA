package part3;

import java.util.Scanner;

public class IndexnotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.print("Search for?: ");
        int userInput = Integer.valueOf(sc.nextLine());

        int index = 0;
        boolean found = false;
        while (index < numbers.length) {
            if (userInput == numbers[index]) {
                found = true;
                break;
            }
            index++;
        }

        if (found) {
            System.out.println(userInput + " is at index " + index);
        } else {
            System.out.println(userInput + " not found.");
        }
        sc.close();
    }
}
