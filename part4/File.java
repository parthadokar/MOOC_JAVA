package part4;

import java.nio.file.Paths;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name (.txt)");
        String userInput = scanner.nextLine();

        try (Scanner sc = new Scanner(Paths.get(userInput))) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
