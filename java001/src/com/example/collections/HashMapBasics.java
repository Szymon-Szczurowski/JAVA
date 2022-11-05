package com.example.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee {
    private String name;

    public Employee(String name) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class HashMapBasics {
    public static void main(String[] args) {

        HashMap<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Adam", new Employee("Adam"));
        hashMap.put("Kasia", new Employee("Kasia"));
        hashMap.put("Ola", new Employee("Ola"));

        hashMap.put("GermanName", new Employee("Karin"));
        hashMap.put("GermanName", new Employee("Wilhelm"));



        Employee e = hashMap.get("Adam");
        System.out.println(e); // Kasia

        System.out.println("\n");


        Employee e2 = hashMap.get("GermanName");
        System.out.println(e2);

        System.out.println("\n");


        Iterator i = hashMap.entrySet().iterator();

        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            String key = (String) entry.getKey();
            Employee employee = (Employee) entry.getValue();
            System.out.println(key + " - " + employee);
        }


        System.out.println("\n");

        for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
            String key = (String) entry.getKey();
            Employee employee = (Employee) entry.getValue();
            System.out.println(key + " - " + employee);

        }

        }
}
