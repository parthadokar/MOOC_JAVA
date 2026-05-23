package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexofSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter nums: (9999 to exit)");
        
        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if (input == 9999) {
                break;
            }
            nums.add(input);
        }

        if (nums.size() > 0) {
            int smallestNumber = nums.get(0);
            for (int i = 0; i < nums.size(); i++) {
                int currentNumber = nums.get(i);
                if (currentNumber < smallestNumber) {
                    smallestNumber = currentNumber;
                }
            }
            System.out.println("Smallest number is " + smallestNumber);

            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == smallestNumber) {
                    System.out.println("Found index at : " + i);
            }
        }
        }

        sc.close();
    }
}
