import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class StringConcatenation {
    public static String concatenateStrings(List<String> strings) {
        // Implement custom collector logic for string concatenation using Stream API and lambda expressions
        return strings.stream().collect(CustomCollectors.joining());
    }
}


class CustomCollectors {
    public static Collector<CharSequence, StringBuilder, String> joining() {
        return Collector.of(
                StringBuilder::new,         // Supplier - initialize the StringBuilder
                StringBuilder::append,      // Accumulator - append each string
                StringBuilder::append,      // Combiner - combine two StringBuilders
                StringBuilder::toString      // Finisher - convert StringBuilder to String
        );
    }
}


public class CustomCollectorForStringConcatenation {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", " ", "World", "!");
        System.out.println(StringConcatenation.concatenateStrings(strings));
    }
}