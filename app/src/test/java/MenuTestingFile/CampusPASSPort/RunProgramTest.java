package MenuTestingFile.CampusPASSPort;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.junit.Test;

public class RunProgramTest {

    public static boolean login(Scanner scanner) {

        String correctUsername = "student123";
        String correctPassword = "password123";

        System.out.println("==============================");
        System.out.println("       STUDENT LOGIN SYSTEM");
        System.out.println("==============================");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername)
                && password.equals(correctPassword)) {

            System.out.println("\nLogin successful!");
            System.out.println("Welcome, " + username + "!");
            return true;

        } else {

            System.out.println("\nInvalid username or password.");
            System.out.println("Please try again.");
            return false;
        }
    }

    public static void requestFormInput(Scanner scanner) {

        System.out.print("Enter Your User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Grade & Section: ");
        String gradeSection = scanner.nextLine();

        System.out.print("State your Reason for Stay Slip: ");
        String reasonForStaySlip = scanner.nextLine();

        System.out.print("Date of Stay: ");
        String dateOfStay = scanner.nextLine();

        System.out.print("Time of Stay: ");
        String timeOfStay = scanner.nextLine();

        System.out.println("\n--- Request Form Details ---");
        System.out.println("User ID: " + userId);
        System.out.println("Grade & Section: " + gradeSection);
        System.out.println("Reason for Stay Slip: " + reasonForStaySlip);
        System.out.println("Date of Stay: " + dateOfStay);
        System.out.println("Time of Stay: " + timeOfStay);
    }

    public static void verificationInput(Scanner scanner) {

        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter Request Status (Pending/Approved/Denied): ");
        String requestStatus = scanner.nextLine();

        System.out.print("Enter Approver Name: ");
        String approverName = scanner.nextLine();

        System.out.print("Enter QR Code: ");
        String qrCode = scanner.nextLine();

        System.out.print("Enter Verification Status (Valid/Expired/Used): ");
        String verificationStatus = scanner.nextLine();

        System.out.println("\n--- Stay Slip Request Details ---");
        System.out.println("User ID: " + userId);
        System.out.println("Request Status: " + requestStatus);
        System.out.println("Approver Name: " + approverName);
        System.out.println("QR Code: " + qrCode);
        System.out.println("Verification Status: " + verificationStatus);
    }

    public static void mainMenu(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n------ MAIN MENU ------");
            System.out.println("1. Log-in Page");
            System.out.println("2. Request Page");
            System.out.println("3. Request Form Status");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Opening Log-in Page...");
                    login(scanner);
                    break;

                case 2:
                    System.out.println("Opening Request Page...");
                    requestFormInput(scanner);
                    break;

                case 3:
                    System.out.println("Opening Request Form Status...");
                    verificationInput(scanner);
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    @Test
    public void Run() {

        int interactionCount = 1;
        StringBuilder simulatedInput = new StringBuilder();

        simulatedInput.append("student123\n");
        simulatedInput.append("password123\n");

        while (interactionCount <= 2) {

            if (interactionCount == 1) {

                simulatedInput.append("2\n");
                simulatedInput.append("STU202601\n");
                simulatedInput.append("Grade 11 - STEM A\n");
                simulatedInput.append("Complete research project\n");
                simulatedInput.append("October 5 2026\n");
                simulatedInput.append("2:30 PM\n");

            } else {

                simulatedInput.append("3\n");
                simulatedInput.append("STU202601\n");
                simulatedInput.append("Approved\n");
                simulatedInput.append("Maria Santos\n");
                simulatedInput.append("QR-STU202601-2026\n");
                simulatedInput.append("Valid\n");
            }

            interactionCount++;
        }

        simulatedInput.append("4\n");

        ByteArrayInputStream automatedInput =
                new ByteArrayInputStream(
                        simulatedInput.toString().getBytes()
                );

        Scanner masterScanner = new Scanner(automatedInput);

        boolean loginSuccessful = login(masterScanner);

        if (loginSuccessful) {
            mainMenu(masterScanner);
        }

        masterScanner.close();
    }
}