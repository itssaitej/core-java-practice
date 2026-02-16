
public class EmployeeDetails {

    // Class variables (attributes)
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize the Employee object
    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name =name;
        this.salary = salary;
    }

    // Method to display the details of the employee
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance (object) of the Employee class
        EmployeeDetails emp1 = new EmployeeDetails(101, "Alice Johnson", 75000.00);

        // Call the displayDetails method on the object
        System.out.println("Employee Details:");
        emp1.displayDetails();
    }
}
