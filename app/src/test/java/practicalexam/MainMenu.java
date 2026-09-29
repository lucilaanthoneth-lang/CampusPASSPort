package practicalexam;

import java.util.Scanner;

public class MainMenu {

    public void Menu( Scanner scanner) {

        System.out.println("----- MAIN MENU -----");
        System.out.println("1. Log-in Page");
        System.out.println("2. Request Page");
        System.out.println("3. Request Form Status");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Opening Log-in Page...");
                break;

            case 2:
                System.out.println("Opening Request Page...");
                break;

            case 3:
                System.out.println("Opening Request Form Status...");
                break;

            case 4:
                System.out.println("Exiting system...");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}