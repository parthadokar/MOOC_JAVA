import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> bookInfo = new ArrayList<>();

        while(true) {
            System.out.println("Title");
            String bookName = sc.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.println("Pages");
            int bookPages = Integer.valueOf(sc.nextLine());
            System.out.println("Publication Year : ");
            int publicationPages = Integer.valueOf(sc.nextLine());
            bookInfo.add(new Books(bookName, bookPages, publicationPages));
        }

        System.out.println("What information will be printed (everything or name)");
        String userInput = sc.nextLine();
        if (userInput.equals("everything")) {
            for (Books e : bookInfo) {
                System.out.println(e);
            }
        }

        if (userInput.equals("name")) {
            for (Books e : bookInfo) {
                System.out.println(e.getTitle());
            }
        }
    }
}
