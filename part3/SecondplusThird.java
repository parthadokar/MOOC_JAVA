package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondplusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter a number to add to the list.");
        while(true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            }
            

            nums.add(userInput);
        }
        int value1 = nums.get(1);
        int value2 = nums.get(2);
        int answer = value1 + value2;
        System.out.println(answer);
        System.out.println(nums.get(5));
        scanner.close();
    }
}
