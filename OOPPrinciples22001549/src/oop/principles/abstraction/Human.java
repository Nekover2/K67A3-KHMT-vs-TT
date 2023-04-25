package oop.principles.abstraction;

// Abstract class, cannot be instantiated
public abstract class Human {

    private String name;
    private int age;

    public Human() {
        this("Unknown", 0);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // abstract method
    public abstract void printInfo();

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
