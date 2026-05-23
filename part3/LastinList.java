package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class LastinList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names");

        while (true) {
            String input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            names.add(input);
        }

        if(names.size() > 0) {
            String firstIndex = names.get(0);
            int lastIndex = names.size() - 1;
            System.out.println(firstIndex);
            System.out.println(names.get(lastIndex));
        } 

        sc.close();
    }
}

