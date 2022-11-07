package com.example.generics;

import java.util.ArrayList;
import java.util.Iterator;

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person{
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name" + this.getName() + ","
                +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

class Organisation<T extends Person>{
    private ArrayList<T> participants;

    public Organisation() {
        participants = new ArrayList<T>();
    }

    public void addParticipants(T p){
        participants.add(p);
    }

    public T getParticipants(int index) {
        return participants.get(index);
    }

    public void PrintParticipants(){
        Iterator<T> iterator = participants.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class Contractor extends Employee{

    public Contractor(String name, String jobTitle) {
        super(name, jobTitle);
    }

    public String toString() {
        return "Contractor{ " +super.toString() + " }";
    }
}


public class OrganisationExample {
    public static void main(String[] args) {

        Organisation<Employee> organisation = new Organisation<>();
        organisation.addParticipants(new Employee("John", "Programmer"));
        organisation.addParticipants(new Employee("Kasia", "Programmer"));
        organisation.addParticipants(new Contractor("Daniel", "Programmer"));

        organisation.PrintParticipants();




    }
}
