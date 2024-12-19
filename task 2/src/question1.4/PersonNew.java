public class PersonNew {
    protected String name; // Name of the person
    protected int age;     // Age of the person

    // Constructor to initialize name and age
    public PersonNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
