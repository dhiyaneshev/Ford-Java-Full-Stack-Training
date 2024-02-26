package collections1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        stringQueue.offer("apple");
//        stringQueue.offer("mango");
//        System.out.println("Element Apple enqueued.");
        System.out.println("Element dequeued: "+stringQueue.poll());
        System.out.println(stringQueue.isEmpty()?"Queue is empty.":"Queue elements: "+stringQueue);

        scanner.close();
    }
}