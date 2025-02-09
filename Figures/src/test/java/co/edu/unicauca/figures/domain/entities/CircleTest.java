/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.figures.domain.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juand
 */
public class CircleTest {

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Circle instance = new Circle(5);
        double expResult = Math.PI*5*5;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Circle instance = new Circle(5);
        double expResult = 2*Math.PI*5;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
