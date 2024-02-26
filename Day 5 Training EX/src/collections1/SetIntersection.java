package collections1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        for(String str: input1){
            set1.add(str);
        }
        for(String str: input2){
            set2.add(str);
        }

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Common elements: "+intersection);

        scanner.close();
    }
}
