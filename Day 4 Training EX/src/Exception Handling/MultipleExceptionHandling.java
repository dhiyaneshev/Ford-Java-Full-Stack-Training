package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        try{
            int[] numbers = new int[10];
            String[] splited = str.split(" ");
            for(int i=0;i<splited.length;i++){
                numbers[i] = Integer.parseInt(splited[i]);
            }
            System.out.println("numbers = " + Arrays.toString(numbers));
        }catch(NumberFormatException nfe){
            System.out.println("Error: Invalid input. Please provide a valid integer.");
        }catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Error: Invalid input. Please provide <= 10 numbers");
        }
    }
}