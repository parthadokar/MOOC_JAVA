package part3;

import java.util.ArrayList;

public class ThirdElement {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Emma");
        // list.add("Alex");
        list.add("Mary");
        System.out.println(list.get(2));
    }
}
