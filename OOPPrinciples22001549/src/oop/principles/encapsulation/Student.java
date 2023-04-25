package oop.principles.encapsulation;

public class Student {

    //Private variables
    private String name;
    private int age;

    //Constructor

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Age must be greater than 0");
            return;
        }
        this.age = age;
    }
    // Public methods
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
