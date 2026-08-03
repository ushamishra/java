package Java8featuresInCollection;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );

        // 1. Using map() -> Returns Stream<List<String>>
        List<List<String>> mapped = nestedList.stream()
                .map(list -> list) // Keeps the internal lists as they are
                .collect(Collectors.toList());
        System.out.println("Mapped: " + mapped);
        // Output: Mapped: [[A, B], [C, D]]

        // 2. Using flatMap() -> Returns Stream<String>
        List<String> flatMapped = nestedList.stream()
                .flatMap(list -> list.stream()) // Flattens individual streams into one
                .collect(Collectors.toList());
        System.out.println("FlatMapped: " + flatMapped);
        // Output: FlatMapped: [A, B, C, D]
    }
}
