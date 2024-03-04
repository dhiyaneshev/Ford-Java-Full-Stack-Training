import java.util.*;
import java.util.stream.Collectors;

class CustomObject{
    private String name;
    private int age;

    public CustomObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomObject{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomObject that)) return false;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
class CustomSorting {
    public static List<CustomObject> sortObjects(List<CustomObject> objects) {
        // Implement logic to sort custom objects using Stream API, lambda expressions, and Comparators
        Comparator<CustomObject> customObjectComparator = Comparator.comparing(CustomObject::getName).thenComparingInt(CustomObject::getAge);

        return objects.stream().sorted(customObjectComparator).collect(Collectors.toList());
    }
}

public class CustomSortingWithComparators {
    public static void main(String[] args) {
        List<CustomObject> objects = Arrays.asList(
                new CustomObject("Varun",35),
                new CustomObject("Arun", 16),
                new CustomObject("Alice", 30),
                new CustomObject("Bob", 25),
                new CustomObject("Alice", 25),
                new CustomObject("Bob", 30)
        ); // Create a list of custom objects

        System.out.println(CustomSorting.sortObjects(objects));
    }
}