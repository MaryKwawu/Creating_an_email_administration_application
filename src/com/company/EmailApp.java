package com.company;

public class EmailApp {

    public static void main(String[] args) {
	// write your code here
        Email email = new Email("Alfred", "Doh-Nani");
        email.setAlternateEmail("ad@gmail.com");
        System.out.println(email.getAlternateEmail());

        email.showInfo();
        System.out.println(email.showInfo());

    }
}
