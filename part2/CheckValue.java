package part2;

public class CheckValue {
    public static void main(String[] args) {
        int number = 0;

        while (true) {
            number = number + 1;
            
            if (number >= 5) {
                break;
            }

            if (number < 5) {
                continue;
            }

            System.out.println(number + " ");
        }
        System.out.println(number + " ");
    }
}
