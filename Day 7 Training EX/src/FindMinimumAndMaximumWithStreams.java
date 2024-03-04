import java.util.Arrays;
import java.util.List;
import java.util.Map;

class MinMaxFinder {
    public static Map<String, Integer> findMinMax(List<Integer> numbers) {
        // Implement logic to find minimum and maximum using Stream API and lambda expressions
        Integer max = numbers.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        Integer min = numbers.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);

        return Map.of("Max", max, "Min", min);
    }
}


public class FindMinimumAndMaximumWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 4);
        System.out.println(MinMaxFinder.findMinMax(numbers));
    }
}
