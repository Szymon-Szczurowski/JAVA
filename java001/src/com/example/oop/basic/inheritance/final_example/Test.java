package com.example.oop.basic.inheritance.final_example;


class Employees{
    String name;
    String surname;
    String jobTitle;
    float salary;

}

class Manager extends Employees{
    String responsibility;

}

class Director extends Manager{
    String department;
}

class VicePresident extends Director{
}

final class CEO extends VicePresident{
    String companyName;
}

//class Somethin extends CEO{
// nie można rozszerzyć klas final
//}



public class Test {
    public static void main(String[] args) {
        CEO ceo = new CEO();

    }
}
