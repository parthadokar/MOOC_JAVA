package part3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String u1 = "alex", p1 = "sunshine";
        String u2 = "emma", p2 = "haskell";

        while (true) {
            System.out.print("Enter username: ");
            String inputUser = sc.nextLine();
            System.out.print("Enter password: ");
            String inputPass = sc.nextLine();
            if ((inputUser.equals(u1) && inputPass.equals(p1)) || 
                (inputUser.equals(u2) && inputPass.equals(p2))) {
                
                System.out.println("You have successfully logged in!");
                break; 
            } else {
                System.out.println("Incorrect username or password.");
            }
        }
        sc.close();
    }
}