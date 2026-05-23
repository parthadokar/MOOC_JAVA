package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class RemembertheNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter Numbers (-1 to stop)");

        while (true) {
            int input = Integer.valueOf(sc.nextLine());

            if (input == -1) {
                break;
            }
            nums.add(input);
        }
        System.out.println("The numbers given by the user are : ");
        System.out.println(nums);
        sc.close();
    }
}
