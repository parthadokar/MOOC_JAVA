package part3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        System.out.println(sum(list));
        list.add(5);
        list.add(1);
        System.out.println(sum(list));
    }

    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number : numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        // System.out.println(sum);
        return sum;
    }
}
