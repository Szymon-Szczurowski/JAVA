public class Student {
    String name;
    String username;
    String city;
    int age;

    Student(){
        name = "Jan";
        username = "Roberto";
        city = "New York";
        age = 20;
    }

    Student(String name, String username, String city, int age) {
        this.name = name;
        this.username = username;
        this.city = city;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);}
}
