public class Employee {

    // Instance variable: unique for each instance of the class
    String employeeName;

    // Static variable: shared among all instances of the class
    static int employeeCount = 0;

    // Constructor to initialize the instance variable and update the static variable
    public Employee(String name) {
        // Assign the instance variable
        this.employeeName = name;

        // Increment the static variable
        employeeCount++;
    }

    // Method to display information about the employee
    public void showEmployeeInfo() {
        // Local variable: exists only within the scope of this method
        int localBonus = 1000;

        // Output the details
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Local Bonus: $" + localBonus);
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        // Displaying information for each employee
        emp1.showEmployeeInfo();
        emp2.showEmployeeInfo();

        // Accessing the static variable directly through the class
        System.out.println("Total number of employees created: " + Employee.employeeCount);
    }
}