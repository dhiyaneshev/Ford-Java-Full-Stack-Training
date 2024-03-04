import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CombineStreams {
    public static List<Integer> combineLists(List<Integer> list1, List<Integer> list2) {
        // Implement logic to combine two lists using Stream API and lambda expressions
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }
}


public class CombiningMultipleStreams {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        System.out.println(CombineStreams.combineLists(list1,list2));

    }
}
