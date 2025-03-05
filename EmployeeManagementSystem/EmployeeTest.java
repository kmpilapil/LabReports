
public class EmployeeTest {
    public static void main(String[] args) {
        //name, id, department, monthsalary
        Employee emp1 = new Employee("Tonald Drump", 6969, "Excellency", 99.0 );
        Employee emp2 = new Employee("Kim Jung", 0001, "Cashier", 1.0);
        Employee emp3 = new Employee("Darack Obama", 0420, "Bartender", 6.0);
        //can use setters and getters to modify
        emp1.setName("Donald Trump");
        emp1.setMonthlySalary(999.0);
        emp1.setDepartment("Meme Poster");
        //display
        System.out.println("Employee Information: \n-----------------------------");
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
    }
}
