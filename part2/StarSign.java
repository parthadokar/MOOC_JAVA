package part2;

public class StarSign {

    public static void main(String[] args) {
        printTriangle(10);
    }

    public static void printStarts(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStarts(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStarts(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printStarts(i);
        }
    }
}
