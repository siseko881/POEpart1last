/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1last;

/**
 *
 * @author RC_Student_lab
 */
class Login {
     public boolean isValidUsername(String username) {
        return username.contains("_") && username.length() == 5;
    }

    // Check if password is at least 8 characters, contains a capital letter and a special character
    public boolean isValidPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasCapital = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasCapital = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        return hasCapital && hasSpecial;
    }

    // Check if phone number starts with '+' and has no more than 10 digits after the code
    public boolean isValidPhoneNumber(String phoneNumber) {
        if (!phoneNumber.startsWith("+")) return false;

        // Remove the '+' and check that the remaining is digits and no more than 10 numbers after the code
        String numbersOnly = phoneNumber.substring(1);
        if (!numbersOnly.matches("\\d+")) return false;

        // Ensure total number length is reasonable (e.g., "+27123456789" = 12 characters)
        return numbersOnly.length() <= 12;
    }

    // Display the user info
    public void verifyDetails(String username, String password, String phoneNumber) {
        System.out.println("\n=== Please Verify Your Information ===");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
    

