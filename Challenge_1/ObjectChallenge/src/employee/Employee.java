package employee;

public class Employee {
    String name, surname;

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println("Name: " + name + " surname: " + surname);
    }
}
