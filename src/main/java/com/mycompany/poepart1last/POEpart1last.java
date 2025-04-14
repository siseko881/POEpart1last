/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1last;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
public class POEpart1last {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Login objlogin = new Login();
        String username = "", password = "", phoneNumber = "";

        // Registration step
        System.out.println("=== Register ===");
        System.out.print("Enter username: ");
        username = scan.nextLine();
        if (!objlogin.isValidUsername(username)) {
            System.out.println("Username is not correctly formatted please ensure that your username contain an underscore and minimum of 5 characters");
            return;
        }else{
            System.out.println("Username sucessfully captured");
            
        }

        System.out.print("Enter password: ");
        password = scan.nextLine();
        if (!objlogin.isValidPassword(password)) {
            System.out.println("Password is incorrectly formatted please ensure that the password contains at least eight characters, a capital letter and a special character");
            return;
        }else{
            System.out.println("Password successfully captured");
            
        }

        System.out.print("Enter phone number (e.g. +27123456789): ");
        phoneNumber = scan.nextLine();
        if (!objlogin.isValidPhoneNumber(phoneNumber)) {
            System.out.println("Cell phone number is incorrectly formatted or does not contain international code.");
            return;
        }else{
            System.out.println("Cell phone number successfully added");
            
        }

        // Login step
        System.out.println("\n=== Login ===");
        System.out.print("Enter your username that you used before: ");
        String loginUsername = scan.nextLine();

        System.out.print("Enter your password that you used before: ");
        String loginPassword = scan.nextLine();

        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.println("Welcome" + username + "it is great to see you again");
        } else {
            System.out.println("Username or password incorrect, please try again");
            return;
        }

        // Show info
        objlogin.verifyDetails(username, password, phoneNumber);
        System.out.print("Is the above information correct? (yes/no): ");
        String confirm = scan.nextLine().trim().toLowerCase();
        if (!confirm.equals("yes")) {
            System.out.println("Login failed");

        }else{
            System.out.println("Login succesful");
        }

    }
}
    

