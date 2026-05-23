package part4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        int count = 0;
        while (true) {
            String line = sc.nextLine();

            if (line.equals("end")) {
                break;
            }
            words.add(line);
            count++;
        }
        int index = 0;
        while (index < words.size()) {
            System.out.println(words.get(index));
            index++;
        }
        System.out.println(count);
    }
}
