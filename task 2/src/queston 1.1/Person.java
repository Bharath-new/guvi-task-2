public class Person {
    private String name; // Name of the person
    private int age;     // Age of the person

    // Default constructor with default age = 18
    public Person() {
        this.age = 18; // Setting default age
    }

    // Parameterized constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to execute and test the class
    public static void main(String[] args) {
        // Object initialized with default constructor (default age = 18)
        Person person1 = new Person();
        person1.name = "Bharath"; // Setting name manually
        person1.displayDetails();

        // Object initialized with name and age using parameterized constructor
        Person person2 = new Person("John", 25);
        person2.displayDetails();
    }
}
