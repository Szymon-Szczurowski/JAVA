package student;

public class Student {
    String name, surname, city;
    int age;

    public Student() {
        name = "unknown";
        surname = "unknown";
        city = "unknown";
        age = 0;
    }

    public Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println("name=" + name + " surname=" + surname + " city=" + city + " age=" + age);
    }
}
