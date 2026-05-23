package part2;

public class AdvancedAstrology {
    
    public static void main(String[] args) {
        christmasTree(10);
    }

    public static void printStarts(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("");
        }
    }

    public static void printTraingle(int size) {
        for (int i = 0; i <= size; i++) {
            printSpaces(size - 1);
            printStarts(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i -1);
            printStarts(i * 2 + 1);
            System.out.println("");
        }

        for (int i = 0; i< 2; i++) {
            printSpaces(height - 2);
            printStarts(3);
            System.out.println("");
        }
    }
}
