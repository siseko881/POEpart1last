/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.poepart1last;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author RC_Student_lab
 */
public class LoginNGTest {
    
    public LoginNGTest() {
    }

   

    /**
     * Test of isValidUsername method, of class Login.
     */
    @Test
    public void testIsValidUsername() {
        System.out.println("isValidUsername");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.isValidUsername(username);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPassword method, of class Login.
     */
    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.isValidPassword(password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPhoneNumber method, of class Login.
     */
    @Test
    public void testIsValidPhoneNumber() {
        System.out.println("isValidPhoneNumber");
        String phoneNumber = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.isValidPhoneNumber(phoneNumber);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyDetails method, of class Login.
     */
    @Test
    public void testVerifyDetails() {
        System.out.println("verifyDetails");
        String username = "";
        String password = "";
        String phoneNumber = "";
        Login instance = new Login();
        instance.verifyDetails(username, password, phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
