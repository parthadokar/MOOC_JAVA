import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye Bye");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);

            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String translated = scanner.nextLine();
                String returnTranslation = dictionary.translate(translated);
                if (returnTranslation == null) {
                    System.out.println("Word " + translated + " was not found.");

                } else {
                    System.out.println(returnTranslation);
                }
            } else {
                System.out.println("Unknown Command");
                continue;
            }
        }
    }
}
