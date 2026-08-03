package Java8featuresInCollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        record Employee(String name, String dept, double salary) {}

        List<Employee> employees = List.of(
                new Employee("Ravi", "Engineering", 90000),
                new Employee("Priya", "Engineering", 95000),
                new Employee("Amit", "Sales", 70000)
        );

        List<String> names2 = employees.stream()
                .map(Employee::name)
                .collect(Collectors.toList());

        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept));


        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                        Collectors.averagingDouble(Employee::salary)));


    }
}
