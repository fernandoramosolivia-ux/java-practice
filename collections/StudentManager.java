package collections;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private final List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Student name cannot be empty."
            );
        }

        students.add(name.trim());
    }

    public void removeStudent(String name) {
        if (!students.remove(name)) {
            throw new IllegalArgumentException(
                    "Student not found: " + name
            );
        }
    }

    public boolean containsStudent(String name) {
        return students.contains(name);
    }

    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        System.out.println("Students:");

        for (String student : students) {
            System.out.println("- " + student);
        }
    }

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        try {
            manager.addStudent("Fernando");
            manager.addStudent("Maria");
            manager.addStudent("Carlos");

            manager.printStudents();

            manager.removeStudent("Maria");

            System.out.println(
                    "Contains Carlos: "
                            + manager.containsStudent("Carlos")
            );

            manager.removeStudent("Pedro");

        } catch (IllegalArgumentException exception) {
            System.out.println(
                    "Error: " + exception.getMessage()
            );
        }
    }
}
