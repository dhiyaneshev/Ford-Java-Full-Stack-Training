package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();
        
        try{
            int answer = numerator/denominator;
            System.out.println("answer = " + answer);
            //note: if everything were in double then answer will be 'answer = infinity'.
        }catch(ArithmeticException ae){
            System.out.println("Error: Division by zero is not allowed.");
        }catch (Exception e){
            System.out.println("Some Error Has Occurred");
        }
    }
}