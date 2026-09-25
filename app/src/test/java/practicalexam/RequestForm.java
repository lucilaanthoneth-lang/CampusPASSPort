package practicalexam;

import java.util.Scanner;

public class RequestForm {
    public static void main(String[] args) { RequestFormInput();}

    public static void RequestFormInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your UserId: ");
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

        scanner.close();


    }

}


