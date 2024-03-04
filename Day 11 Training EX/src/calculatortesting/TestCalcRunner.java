package calculatortesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Scanner;

public class TestCalcRunner {
    public static void main(String[] args) {
        System.out.println();
        Result result = JUnitCore.runClasses(TestCalculator.class);
        System.out.println("Tests were "+(result.wasSuccessful()?"successful":"unsuccessful"));

        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Operand 1: ");
        int a = sc.nextInt();
        System.out.print("Operand 2: ");
        int b = sc.nextInt();

        System.out.println("Addition Result: "+c.add(a,b)+"\n" +
                "Subtraction Result: "+c.subtract(a,b)+"\n" +
                "Multiplication Result: "+c.multiply(a,b)+"\n" +
                "Division Result: "+c.divide(a,b)+"\n");

    }
}