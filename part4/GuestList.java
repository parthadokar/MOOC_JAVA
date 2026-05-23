package part4;

import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter file name: (.txt)");
        String fileName = sc.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName
        ))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.println("Enter names, empty lines quits");
        while (true) {
            String checkUser = sc.nextLine();
            if (checkUser.isEmpty()) {
                break;
            }

            if (list.contains(checkUser)) {
                System.out.println("The name is on the list");
            } else {
                System.out.println("The name is not on the list");
            }
        }

    }
}
