package part3;

import java.util.Scanner;

public class AgeoftheOldest {
    public static void main(String[] args) {
        String oldestName = "";
        int oldestAge = -1;
        Scanner sc  = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter info:");
            String inputString = sc.nextLine();

            if (inputString.equals("")) {
                break;
            }

            String[] pieces = inputString.split(",");
            String name = pieces[0];
            int age = Integer.valueOf(pieces[1]);

            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }
        }
        if (oldestAge != -1) {
            System.out.println("Age of the oldest: " + oldestAge);
            System.out.println("Name of the oldest: " + oldestName);
        }
        sc.close();
    }
}
