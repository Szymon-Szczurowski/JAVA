public class Programmer extends Employee {
    public String languages;

    public Programmer(String languages, String name, String surname) {
        this.languages = languages;
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Languages: " + languages);}

}
