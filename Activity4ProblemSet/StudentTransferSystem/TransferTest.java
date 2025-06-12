package Activity4ProblemSet.StudentTransferSystem;

public class TransferTest {
    public static void main(String[] args) {
        // Create classrooms
        Classroom classA = new Classroom("Class A");
        Classroom classB = new Classroom("Class B");

        // Create students
        Student s1 = new Student("Mike", 690);
        Student s2 = new Student("Marco", 420);
        Student s3 = new Student("Michaela", 666);

        // Add students to Class A
        classA.addStudent(s1);
        classA.addStudent(s2);
        classA.addStudent(s3);

        // Display students before transfer
        System.out.println("Before Transfer:");
        classA.displayStudents();
        classB.displayStudents();

        // Transfer Bob from Class A to Class B
        classA.transferStudent(s1, classB);

        // Display students after transfer
        System.out.println("\nAfter Transfer:");
        classA.displayStudents();
        classB.displayStudents();
    }
}
