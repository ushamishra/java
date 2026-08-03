package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (age=" + age + ", salary=" + salary + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 75000));
        employees.add(new Employee("Bob", 25, 75000));
        employees.add(new Employee("Charlie", 30, 60000));
        employees.add(new Employee("David", 25, 90000));

        // 1. Basic Comparator using anonymous class
        Comparator<Employee> byAge = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.age - e2.age;
            }
        };
        employees.sort(byAge);
        System.out.println("By age: " + employees);

        // 2. Lambda version (shorter)
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("By salary: " + employees);

        // 3. Comparator.comparing() - cleanest, modern approach
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("By name: " + employees);

        // 4. Descending order using reversed()
        employees.sort(Comparator.comparing((Employee e) -> e.salary).reversed());
        System.out.println("By salary desc: " + employees);

        // 5. Multi-level sorting with thenComparing()
        // Sort by age, then by salary if ages are equal
        employees.sort(
                Comparator.comparingInt((Employee e) -> e.age)
                        .thenComparing(e -> e.salary)
        );
        System.out.println("By age, then salary: " + employees);

        // 6. Using Comparator in a PriorityQueue
        PriorityQueue<Employee> pq = new PriorityQueue<>(
                Comparator.comparingDouble(e -> e.salary)
        );
        pq.addAll(employees);
        System.out.println("PQ poll order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
