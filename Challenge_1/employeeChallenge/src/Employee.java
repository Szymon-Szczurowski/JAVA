public class Employee {
    public String name;
    public String surname;

    Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void printInfo() {
        System.out.println("Name: " + name + " surname: " + surname);
    }
}