package com.example.oop.basic.inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {

        Employee employee = new Employee("Adam","Kowalski", 22);
        employee.printInfo();

        Manager manager = new Manager("Jan", "Jamal",  35, "R&D" );
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

//        Person person2 = new Person(); //Person jest abstrakcyjna, nie można stworzyć jej intancji
    }
}
