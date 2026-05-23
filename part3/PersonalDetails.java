package part3;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longestName = "";
        int sumofYears = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter details: ");
            String inputString = sc.nextLine();
            if (inputString.equals("")) {
                break;
            }

            String[] pieces = inputString.split(",");
            int year = Integer.valueOf(pieces[1]);
            String name = pieces[0];
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            sumofYears += year;
            count++;
        }

        if (count > 0) {
            double average = (double) sumofYears / count;
            System.out.println("Longest name: " + longestName);
            System.out.println("Average " + average);
        }

        sc.close();

    }
}
