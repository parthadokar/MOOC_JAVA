package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Add numbers (-1 to exit)");

        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if (input == -1) {
                break;
            }
            nums.add(input);
        }

        System.out.println("From where? ");
        int userFirstInput = Integer.valueOf(sc.nextLine());
        System.out.println("To where?");
        int userSecondInput = Integer.valueOf(sc.nextLine());

        for (int i = userFirstInput; i <= userSecondInput; i++) {
            System.out.println(nums.get(i));
        }
        sc.close();
    }
}
