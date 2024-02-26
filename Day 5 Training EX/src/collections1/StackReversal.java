package collections1;

import java.util.Stack;
import java.util.Scanner;

public class StackReversal {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        integerStack.add(1);
        integerStack.add(2);
        integerStack.add(3);
        integerStack.add(4);
        System.out.println("Original stack: "+integerStack);
        System.out.println("Reversed stack: "+integerStack.reversed());

        scanner.close();
    }
}