package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter nums: ");
        
        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if (input == -1) {
                break;
            }
            nums.add(input);
        }

        if (nums.size() > 0) {
            int bigNumber = nums.get(0);

            for (int i = 0; i < nums.size(); i++) {
                int currentNumber = nums.get(i);
                if (currentNumber > bigNumber) {
                    bigNumber = currentNumber;
                }
            }
            System.out.println("The greatest number is : " + bigNumber);
        }

        sc.close();
    }
}
