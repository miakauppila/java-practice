package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String emailAddress;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "greatcompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("User created: " + this.firstName + " " + this.lastName);

        // Call a method that returns the department
        this.department = setDepartment();

        // combine elements to create email address
        this.emailAddress = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;

        // Call a method that generates a random password
        this.password = createRandomPassword(defaultPasswordLength);
        System.out.println("Password generated: " + this.password);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nPlease enter the department code: ");
        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "acct";
        } else {
            return "general";
        }
    }

    // Generate a random password
    private String createRandomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz0123456789!#%&?";
        char[] createdPassword = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            createdPassword[i] = passwordSet.charAt(random);
        }
        return new String(createdPassword);
    }

    public String showInfo() {
        return "DISPLAY NAME: " + this.firstName + " " + this.lastName +
                "\nCOMPANY EMAIL: " + this.emailAddress +
                "\nMAILBOX CAPACITY: " + this.mailboxCapacity + " mb";
    }

    public void changeMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
}
