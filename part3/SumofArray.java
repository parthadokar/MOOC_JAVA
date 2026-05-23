package part3;

public class SumofArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        // sumOfNumbersInArray(numbers);
        // printNeatly(numbers);
        printArrayinStars(numbers);
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            sum += number;
            index++;
        }
        System.out.println(sum);
        return sum;
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length) {
                System.out.print(", ");
            }
        }
    }

    public static void printArrayinStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
