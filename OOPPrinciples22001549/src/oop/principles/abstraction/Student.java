package oop.principles.abstraction;

import oop.principles.polymorphism.Human;

// Student is a Human, It inherits from Human
public class Student extends Human {

// Private variables
    private String id;
    // Constructor, super() is called implicitly, if not specified
    public Student() {
        super();
        this.id = "Unknown";
    }

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    // Getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Overriding abstract method
    @Override
    public void printInfo() {
        System.out.println("Student info:");
        super.printInfo();
        System.out.println("ID: " + id);
    }

}
