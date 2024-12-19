public class Worker extends PersonNew {
    private int employeeId;    // Employee ID
    private double salary;     // Employee Salary

    // Constructor to initialize all attributes
    public Worker(String name, int age, int employeeId, double salary) {
        super(name, age); // Call to PersonNew's constructor using super
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display worker details
    public void displayWorkerDetails() {
        // Call base class method to display name and age
        super.displayPersonDetails(); // Calls PersonNew's displayPersonDetails
        // Display Worker-specific details
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create a Worker object
        Worker worker = new Worker("Bharath", 30, 1001, 75000.0);

        // Display Worker details
        System.out.println("Worker Details:");
        worker.displayWorkerDetails();
    }
}
