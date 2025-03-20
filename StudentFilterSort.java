import java.util.*;
import java.util.stream.Collectors;
class Student {
    String name;
    double marks;
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}
public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85.5),
            new Student("Bob", 72.3),
            new Student("Charlie", 90.1),
            new Student("David", 65.4),
            new Student("Eve", 78.9)
        );
        List<Student> filteredAndSortedStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted(Comparator.comparingDouble(s -> -s.marks)) // Descending order
            .collect(Collectors.toList());
        System.out.println("Students scoring above 75%, sorted by marks:");
        filteredAndSortedStudents.forEach(System.out::println);
    }
}
