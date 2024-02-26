package exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMessage){
        super(errorMessage);
    }
}

public class CustomExceptionExample {
    protected static void validateAge(int age) throws InvalidAgeException {
        if(age<0 || age>150){
            throw new InvalidAgeException("Age must be between 0 and 150.");
        }else{
            System.out.println("You are probably a human");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");


        try{
            int age = sc.nextInt();
            validateAge(age);
        }catch (InvalidAgeException ageEx){
            System.out.println("InvalidAgeException: "+ageEx.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}