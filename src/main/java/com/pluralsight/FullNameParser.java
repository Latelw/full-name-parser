package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ask for the name, then Trim
        System.out.println("Please enter your name: ");
        String fullName = scan.nextLine().trim();

        //Find the space, cut off first name.
        int indexFirstName = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexFirstName).trim();
        String middleName = "";
        String lastName = "";

        //Find the middle name??//
        int secondSpace = fullName.indexOf(" ", indexFirstName + 1);
        //Find Last name??
        //Middle name returns -1 and breaks the code

        if (secondSpace == -1){
            lastName = fullName.substring(indexFirstName + 1).trim();

        }else {
            middleName = fullName.substring(indexFirstName + 1, secondSpace).trim();
            lastName = fullName.substring(secondSpace).trim();

        }




        //Print full name//
        System.out.println("First name: " + firstName);

        if (middleName.isEmpty()){
            System.out.println("none");

        }else {
            System.out.println("Middle name: " + middleName);
        }
        System.out.println("Last Name : " + lastName);

        scan.close();










    }
}