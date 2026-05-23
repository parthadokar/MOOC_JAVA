package part4;

import java.nio.file.Paths;
import java.util.Scanner;

public class IsitInTheFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name (.txt)");
        String fileName = sc.nextLine();

        System.out.println("Search for user");
        String userName = sc.nextLine();

        boolean isFound = false;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if(userName.equals(row)) {
                    isFound = true;
                }
            }
            if (isFound) {
                System.out.println("Found");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
