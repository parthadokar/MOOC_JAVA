package part2;

import java.util.Scanner;

public class ParameterToOne {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // System.out.println("first?");
            // int firstUserValue = Integer.valueOf(sc.nextLine());
            // System.out.println("second?");
            // int secondUserValue = Integer.valueOf(sc.nextLine());
            // System.out.println("====================");
            // divisbleByThree(firstUserValue, secondUserValue);
            int value = numberUno();
            System.out.println(value);
            String valueString = word();
            System.out.println(valueString);
            int totalSum = sum(1,2,3);
            System.out.println(totalSum);
            int answer = smallest(10, 7);
            System.out.println(answer);
            sc.close();
        }
        
        public static int smallest(int num1, int num2) {
            if (num1 > num2) {
                return num2;
            } else {
                return num1;
            }
        }

        public static void divisbleByThree(int beginnning, int end) {
            for (int i = beginnning; i <= end; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }

        public static int numberUno() {
            return 1;
        }

        public static String word() {
            return "hope";
        }

        public static int sum(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }
}
