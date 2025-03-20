import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 55000)
        );

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sort by Name
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        // Sort by Age
        employees.sort(Comparator.comparingInt(e -> e.age));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        // Sort by Salary
        employees.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}
