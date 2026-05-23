import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PersonalInformation> personalInformation = new ArrayList<>();
        System.out.println("Enter your first name, last name and identification number");

        while (true) {
            String userFirstName = sc.nextLine();
            if (userFirstName.isEmpty()) {
                break;
            }

            String userLastName = sc.nextLine();
            String identificationNumber = sc.nextLine();
            personalInformation.add(new PersonalInformation(userFirstName, userLastName, identificationNumber));
        }

        System.out.println();
        System.out.println("Names : ");

        for (PersonalInformation e : personalInformation) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }
    }
}
