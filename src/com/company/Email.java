package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String Password;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String department;
    private String changePassword;
    private String companySuffix = "company.com";

    //constructor to recieve firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // call a method asking for department-return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call a method to generate a random password
        this.Password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is:  "  + this.Password);

        //combine element to generate email
        email = firstName.toLowerCase() + " " + lastName.toLowerCase() + " @ " + department + "  " + companySuffix;
        //System.out.println("Your email is:  "  +  email);

    }


    // ask for department
    private String setDepartment() {
        System.out.println("New Worker: " + firstName+ ". Department Codes\n" +
                "1  For sales\n" +
                "2  For Development\n" +
                "3  For Accounting\n" +
                "0 Enter Department Codes:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if(depChoice == 2) {
            return "dev";
        } else if(depChoice == 3){
            return "acct";
        } else {
            return "";
        }
    }
    // generate random password
    private String randomPassword(int length) {
        String passwordSet = "ASDQWERTYUIOPASDFGHJKLZXCVBNM,./;'[]123456667890";
                char [] password = new char[length];
                for(int i = 0; i < length; i++) {
                    int rand = (int) (Math.random() * passwordSet.length());
                    password[i] = passwordSet.charAt(rand);
                }

        return new String(password);
    }

    //set mailbox capasity
    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    //set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //change password
    public void changePassword(String password){
        this.changePassword = changePassword;
    }

    //get mail box capacity
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    //get alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    //get password

    public String getPassword() {
        return Password;
    }

    public String showInfo(){
        return "Display Name:  \n"  +  firstName  + "  " +  lastName +  "Company Email:  \n" +  "mailBox Capasity  \n" +  mailBoxCapacity   +"mb";
    }
}

