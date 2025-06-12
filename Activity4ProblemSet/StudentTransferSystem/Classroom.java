package Activity4ProblemSet.StudentTransferSystem;

import java.util.ArrayList;

public class Classroom {
    private String className;
    private ArrayList<Student> students;

    // Constructor
    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    // Add student to classroom
    public void addStudent(Student student) {
        students.add(student);
    }

    // Remove student from classroom
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Display all students in the classroom
    public void displayStudents() {
        System.out.println("Students in " + className + ":");
        if (students.isEmpty()) {
            System.out.println("  (No students enrolled)");
        } else {
            for (Student s : students) {
                s.displayInfo();
            }
        }
        System.out.println(); // spacer
    }

    // Transfer a student to another classroom
    public void transferStudent(Student student, Classroom newClassroom) {
        if (students.contains(student)) {
            this.removeStudent(student);
            newClassroom.addStudent(student);
            System.out.println(student.getName() + " has been transferred from " + this.className + " to " + newClassroom.className + ".");
        } else {
            System.out.println(student.getName() + " is not enrolled in " + this.className + ".");
        }
    }
}
