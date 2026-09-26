package practicalexam;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Sample student accounts
        String correctUsername = "student123";
        String correctPassword = "password123";

        System.out.println("================================");
        System.out.println("       STUDENT LOGIN SYSTEM      ");
        System.out.println("================================");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Check login credentials
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("\nLogin successful!");
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("\nInvalid username or password.");
            System.out.println("Please try again.");
        }

        scanner.close();
    }
}

