package com.example.oop.basic.inheritance.polymorphism_casting;

class Employee {
    private String name;
    private String jobTitle;
    private float salary;

    public Employee(){
        name = "unknown";
        jobTitle = "unknown";
        salary = 4000.0f;
    }

    public Employee(String name, String jobTitle, float salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("Doing work!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Employee: " + name);
    }
}

class Manager extends Employee {
    private String departmentName;


    public Manager() {
        super();
        departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, float salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void hireEmployee(){
        System.out.println("Emploee hire");
    }

    public void giveRise(Employee employee){
        System.out.println("Employee got rise!");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void printInfo() {
        System.out.println("Manager: " + getName());
    }
}

class Ceo extends Manager {
    private int sharesNumber;

    public Ceo() {
        sharesNumber = 100;
    }

    public Ceo(String name, String jobTitle, float salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public void signContract(){
        System.out.println("Contract signed!");
    }


    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    public void printInfo() {
        System.out.println("Ceo: " + getName());
    }
}

public class CompanyCastingExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Programmer", 10000.0f);
        Manager manager = new Manager("Karol", "Team Leader", 10000.0f, "R&D");
        Employee employeeCeo = new Ceo("Szymon", "Prezes", 20000.0f, "Board", 100);


//        employeeCeo = manager;

//        employeeCeo.signContract(); nie zadziała

//        Ceo ceo = (Ceo) employeeCeo;
//        ceo.signContract();

        if (employeeCeo instanceof Ceo) {
            Ceo ceo = (Ceo) employeeCeo;
            ceo.signContract();
        }




    }
}
