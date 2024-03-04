import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface SquareOperation3 {
    int square(int number);
}

class ParallelProcessing {
    public static int sumOfSquares(List<Integer> numbers, SquareOperation3 operation) {
        // Implement parallel processing logic using Stream API and lambda expressions
        return numbers.parallelStream()
                .mapToInt(operation::square)
                .sum();
    }
}


public class ParallelProcessingWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100) .boxed()
                .collect(Collectors.toList());// Generate a large list of integers
        SquareOperation3 squareOperation = number->number*number;// Define the square operation using lambda expression

        long startTime = System.currentTimeMillis();
        int sumOfSquares = ParallelProcessing.sumOfSquares(numbers, squareOperation);
        long endTime = System.currentTimeMillis();

        System.out.println("Sum of Squares: " + sumOfSquares);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

    }
}
