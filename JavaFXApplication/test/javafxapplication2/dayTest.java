/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javafxapplication2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aaronyeh
 */
public class dayTest {
    
    public dayTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDayOfWeek method, of class day.
     */
    @Test
    public void testGetDayOfWeek() {
        System.out.println("getDayOfWeek");
        day instance = null;
        String expResult = "";
        String result = instance.getDayOfWeek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDayOfWeek method, of class day.
     */
    @Test
    public void testSetDayOfWeek() {
        System.out.println("setDayOfWeek");
        String dayOfWeek = "";
        day instance = null;
        instance.setDayOfWeek(dayOfWeek);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDay method, of class day.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        day instance = null;
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDay method, of class day.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 0;
        day instance = null;
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getYear method, of class day.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        day instance = null;
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setYear method, of class day.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        day instance = null;
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
