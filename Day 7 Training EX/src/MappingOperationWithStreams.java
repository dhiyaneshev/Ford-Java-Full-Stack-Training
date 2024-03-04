import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface SquareOperation {
    int square(int number);
}

class MappingOperation {
    public static List<Integer> squareList(List<Integer> numbers, SquareOperation operation) {
        // Implement mapping logic using Stream API and lambda expressions
        return numbers.stream().map(operation::square).collect(Collectors.toList());

    }
}

public class MappingOperationWithStreams {
    public static void main(String[] args) {
        // Test the squareList method with a sample input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        SquareOperation squareOperation = number -> number*number; // Define the square operation using lambda expression

        List<Integer> squaredList = MappingOperation.squareList(numbers, squareOperation);
        System.out.println("Squared List = " + squaredList);

    }
}