package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Indexof {
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
        
        System.out.println("Search for ?");
        int findNumber = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < nums.size(); i++) {
            if (findNumber == nums.get(i)) {
                System.out.println("Index is " + i);
            }
        }
        sc.close();
    }
}
