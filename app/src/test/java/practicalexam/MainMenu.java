package practicalexam;

import java.util.Scanner;

public class MainMenu {

    public void Menu(Scanner menuinput) {

        boolean choosing = true;

        do {
            System.out.println("=====MAIN MENU=====");
            System.out.println("1. Request Form");
            System.out.println("2. Request Form Status");
            System.out.println("3. Exit");
            System.out.print("Please choose an option (1, 2, 3): ");

            String choice = menuinput.nextLine();

            System.out.println(choice);

            if (choice.equals("1")) {

                RequestForm.RequestFormInput(menuinput);

            }

            else if (choice.equals("2")) {

                RequestFormStatusApprovedStaySlip.StaySlipComponent(menuinput);

            }

            else if (choice.equals("3")) {

                System.out.println("Goodbye!");
                choosing = false;

            }

            else {

                System.out.println("===================");
                System.out.println("Invalid choice please try again.");
                System.out.println("===================");

            }

        } while (choosing);
    }
}