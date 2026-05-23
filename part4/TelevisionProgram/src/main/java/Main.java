import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TelevisionProgram> programInfo = new ArrayList<>();
        System.out.println("Enter program name and duration (empty to exit)");
        while (true) {
            String details = sc.nextLine();
            if (details.isEmpty()) {
                break;
            }

            String [] parts = details.split(",");
            String showName = parts[0];
            int showDuration = Integer.valueOf(parts[1]);
            programInfo.add(new TelevisionProgram(showName, showDuration));
        }

        System.out.println("Programs maximum duration");
        int userInput = Integer.valueOf(sc.nextLine());

        for (TelevisionProgram e : programInfo) {
            if (e.getDuration() <= userInput) {
                System.out.println(e.getName() + ", " + e.getDuration());
            }
        }
        sc.close();
    }
}
