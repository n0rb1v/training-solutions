package lambdaintermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intermediate {
    List<Employee> employees = Arrays.asList(
            new Employee("Jani"),
            new Employee("Jane"),
            new Employee("John"),
            new Employee("Geza")
    );

    public static void main(String[] args) {
        Intermediate im = new Intermediate();
        List<Employee> filtered = im.employees.stream()
                .filter(e -> e.getName().startsWith("Jan")).collect(Collectors.toList());
        System.out.println(filtered);

        List<String> filter2 = Stream.of("John", "John", "Jane", "John")
                .distinct().collect(Collectors.toList());
        System.out.println(filter2);

        List<Employee> filter3 = im.employees.stream()
                .skip(1).limit(2).collect(Collectors.toList());
        System.out.println(filter3);

        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        Stream.iterate(1, n -> n + 2).skip(2).limit(3).forEach(System.out::println);

        List<String> names = im.employees.stream().limit(2)
                .map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(names);

        List<String> s1 = Arrays.asList("John","Jane");
        List<String> s2 = Arrays.asList("Jack","Joe");
        List<String> sx = Stream.of(s1, s2).flatMap(e ->e.stream()).collect(Collectors.toList());
        System.out.println(sx);

        List<Employee> sorted = im.employees.stream().sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(sorted);

        List<String> namez = im.employees.stream()
                .map(e -> e.getName())
                .peek(System.out::println)
                .sorted()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(namez);
    }
}
