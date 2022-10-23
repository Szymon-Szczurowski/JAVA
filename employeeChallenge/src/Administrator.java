public class Administrator extends Employee{
    public String certifcates;

    public Administrator(String certifcates, String name, String surname){
        this.certifcates = certifcates;
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println("certifcates: " + certifcates + " name: " + name + " surname: " + surname);
}}
