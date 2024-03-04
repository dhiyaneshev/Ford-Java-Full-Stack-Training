package calculatortesting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void testGreetAdd() {
        Calculator c = new Calculator();
        assertEquals(8, c.add(5,3));
//        assertEquals(1, c.subtract(1,2));
//        assertEquals(2, c.multiply(1,2));
//        assertEquals(0, c.divide(1,2));
    }
    @Test
    public void testGreetSub() {
        Calculator c = new Calculator();
//        assertEquals(3, c.add(1,2));
        assertEquals(2, c.subtract(5,3));
//        assertEquals(2, c.multiply(1,2));
//        assertEquals(0, c.divide(1,2));
    }
    @Test
    public void testGreetMul() {
        Calculator c = new Calculator();
//        assertEquals(3, c.add(1,2));
//        assertEquals(1, c.subtract(1,2));
        assertEquals(15, c.multiply(5,3));
//        assertEquals(0, c.divide(1,2));
    }
    @Test
    public void testGreetDiv() {
        Calculator c = new Calculator();
//        assertEquals(3, c.add(1,2));
//        assertEquals(1, c.subtract(1,2));
//        assertEquals(2, c.multiply(1,2));
        assertEquals(1, c.divide(5,3));
    }
}