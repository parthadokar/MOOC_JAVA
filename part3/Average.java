package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter numbers (-1 to exit)");

        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if (input == -1) {
                break;
            }
            nums.add(input);
        }

        int sum = 0;
        int totalNumbers = nums.size();
        for (Integer num : nums) {
            sum += num;
        }
        
        double average = (double) sum / totalNumbers;
        System.out.println("Average : " + average);
        sc.close();
    }
}
