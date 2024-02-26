package collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPopulation {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        studentGrades.put("Mary",67);
        studentGrades.put("Yadav",87);
        studentGrades.put("Javad",79);
        System.out.println("Add student and grade");
        String name = scanner.nextLine();
        int marks = scanner.nextInt();
        studentGrades.put(name,marks);
        scanner.nextLine();

        System.out.println("Remove student");
        String removeName = scanner.nextLine();
//        scanner.nextLine();
        Integer rem = (Integer) studentGrades.remove(removeName);

        System.out.println("Printing Hash map: "+studentGrades);



        scanner.close();
    }
}