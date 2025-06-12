package Activity4ProblemSet.StudentTransferSystem;

public class Student {
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }

    // Optional: Getters if needed by other classes
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
