package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter user's first name: ");
        String fName = scanner.next();
        System.out.print("Please enter user's last name: ");
        String lName = scanner.next();

        Email email1 = new Email(fName, lName);
        System.out.println(email1.showInfo());

        while(true) {
            System.out.print("OPTIONS\n1 change password\n2 change mailbox capacity\n3 set alternate email\n4 exit\nPlease enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Please enter new password: ");
                String newPassword = scanner.next();
                System.out.print("Please re-enter new password: ");
                String newPassword2 = scanner.next();
                if (newPassword.equals(newPassword2)) {
                    email1.changePassword(newPassword);
                    System.out.println("Password changed.");
                } else {
                    System.out.println("Passwords do not match");
                }
            } else if (choice == 2) {
                System.out.print("OPTIONS\n1 750 mb\n2 950 mb\nPlease choose the desired mailbox capacity: ");
                int capacityChoice = scanner.nextInt();
                if (capacityChoice == 1) {
                    email1.changeMailboxCapacity(750);
                } else {
                    email1.changeMailboxCapacity(950);
                }
                System.out.println("Mailbox capacity changed to " + email1.getMailboxCapacity() + " mb");
            } else if (choice == 3) {
                System.out.print("Please enter your alternate email address: ");
                String secondEmail = scanner.next();
                email1.setAlternateEmail(secondEmail);
                System.out.println("Alternate email address changed to: " + email1.getAlternateEmail());
            }
            else {
                break;
            }
        }

    }
}
