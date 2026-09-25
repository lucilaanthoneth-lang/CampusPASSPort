package com.example.digistayslip;

import java.util.Scanner;

public class  ExampleUnitTest {

    public static void main(String[] args) {
        StaySlipComponent();
    }

    public static void StaySlipComponent() {

        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
