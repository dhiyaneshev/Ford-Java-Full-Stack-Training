import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface FilterCondition2 {
    boolean test(int number);
}
@FunctionalInterface
interface SquareOperation2 {
    int square(int number);
}

class CombinedOperation {
    public static List<Integer> filterAndSquareList(List<Integer> numbers, FilterCondition2 condition, SquareOperation2 operation) {
        // Implement combined filtering and mapping logic using lambda expressions and Stream API
        return numbers.stream().filter(condition::test).map(operation::square).collect(Collectors.toList());
    }
}

public class FilteringAndMappingCombined {
    public static void main(String[] args) {
        // Test the filterAndSquareList method with a sample input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        FilterCondition2 condition = number -> number%2==0;// Define the condition using lambda expression
        SquareOperation2 squareOperation = number -> number*number; // Define the square operation using lambda expression

        List<Integer> filterAndSquareList = CombinedOperation.filterAndSquareList(numbers, condition, squareOperation);
        System.out.println("Filtered and Squared List = " + filterAndSquareList);

    }
}
