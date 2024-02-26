package collections1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicListManipulation {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here

        boolean flag = true;
        while(flag) {
            System.out.println("\n1  // Add element\n" +
                    "2  // Remove element\n" +
                    "3  // Find element index\n" +
                    "4  // Display all elements\n" +
                    "5  // Exit\n"
            );
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int numToAdd = scanner.nextInt();
                    integerList.add(numToAdd);
                    System.out.println("Element " + numToAdd + " added to the list.");
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    Integer numToRemove = scanner.nextInt();
                    integerList.remove(numToRemove);
                    System.out.println("Element " + numToRemove + " removed from the list.");
                    break;
                case 3:
                    System.out.print("Enter element to find: ");
                    int numToFind = scanner.nextInt();
                    int index = integerList.indexOf(numToFind);
                    if(index==-1) System.out.println("Element not found");
                    else System.out.println("Element " + numToFind + " found at index " + index + ".");
                    break;
                case 4:
                    System.out.print("Elements in the list: " + integerList.toString());
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }

        scanner.close();

    }
}

