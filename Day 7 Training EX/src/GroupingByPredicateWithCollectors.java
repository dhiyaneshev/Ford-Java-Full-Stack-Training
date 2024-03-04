import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class CategorizingStrings {
    public static Map<Boolean, List<String>> categorizeStrings(List<String> strings) {
        // Implement categorization logic using Stream API, lambda expressions, and groupingBy collector
        Predicate<String> startsWithVowel = s -> "aeiou".contains(String.valueOf(s.toLowerCase().charAt(0)));

        return strings.stream().collect(Collectors.groupingBy(startsWithVowel::test));
    }
}


public class GroupingByPredicateWithCollectors {
    public static void main(String[] args) {
        // Test the categorizeStrings method with a sample input
        List<String> strings = Arrays.asList("apple", "banana", "orange", "pear", "grape");
        Map<Boolean, List<String>> categorizedStrings = CategorizingStrings.categorizeStrings(strings);
        System.out.println("Categorized Strings = " + categorizedStrings);
    }
}
