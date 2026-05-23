package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("1");
        names.add("2");
        names.add("3");
        names.add("4");
        names.add("5");
        names.add("6");
        names.add("7");
        names.add("8");
        // int index = 0;
        // while (index < names.size()) {
        //     System.out.println(names.get(index));
        //     index++;
        // }

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        sc.close();
    }
}
