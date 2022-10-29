package employee;

public class Programmer extends Employee{
    String languages;

    public Programmer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    public void printInfo() {
        System.out.println("name: " + name + " surname: " + surname + " languages: " + languages);
    }
}
