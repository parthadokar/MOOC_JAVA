package part4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberFromAFile {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String userInput = sc.nextLine();

        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(sc.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(sc.nextLine());

        int count = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(userInput))) {
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        for (String item : list) {
            int number = Integer.valueOf(item);
            if (number >= lowerBound && number <= upperBound) {
                count += 1;
            } else {
                continue;
            }
        }
        System.out.println("Numbers " + count);
    }
}
