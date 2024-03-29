import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface FilterCondition {
    boolean test(int number);
}

class FilterOperation {
    public static List<Integer> filterList(List<Integer> numbers, FilterCondition condition) {
        // Implement filtering logic using lambda expressions
        return  numbers.stream().filter(condition::test).collect(Collectors.toList());
    }
}

public class SimpleFilterOperation {
    public static void main(String[] args) {
        // Test the filterList method with a sample input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        FilterCondition condition = number -> number%2==0; // Define the condition using lambda expression

        List<Integer> filteredList = FilterOperation.filterList(numbers, condition);
        System.out.println("Filtered List = " + filteredList);

    }
}