package com.example.oop.basic.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania", "Kowalska", 5);
        Teacher teacher = new Teacher("Adam" , "Dobrzyński", "math");
        System.out.println(teacher.getTeachingSubject());

        Teacher teacher2 = new Teacher("Adam" , "Dobrzyński", "biology");
        System.out.println(teacher2.getTeachingSubject());

        Director director = new Director("Rafał", "Szczurowski", 1);



    }
}
