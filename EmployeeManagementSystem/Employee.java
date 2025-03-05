
//attributes
public class Employee {
    private String name;
    private int employeeId;
    private String department;
    private double monthlySalary;
    //Parameterized constructor
public Employee (String name, int employeeId, String department, double monthlySalary) {
    this.name = name;
    this.employeeId = employeeId;
    this.department = department;
    this.monthlySalary = monthlySalary;
}
//Method to calculate annual salary
public double calculateAnnualSalary() {
    return monthlySalary * 12;
}
//Method to print employee details
public void displayEmployeeInfo() {
    String info = String.format(
                "Name: %s %n"
                + "Employee ID: %d %n"
                + "Department: %s %n"
                + "Monthly Salary: $ %f %n"
                + "Annual Salary: $ %f %n"
                + "-----------------------------",
        name, employeeId, department, monthlySalary, calculateAnnualSalary()
    );
    System.out.println(info);
}
//Setters and Getters
 // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter for monthlySalary with validation
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            System.out.println("Salary cannot be negative.");
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

}
