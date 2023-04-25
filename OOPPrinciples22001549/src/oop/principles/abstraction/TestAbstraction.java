package oop.principles.abstraction;

public class TestAbstraction {

    public static void main(String[] args) {
        // Human human = new Human("John", 20); // cannot instantiate abstract class
        // human.printInfo();

        // Abstract class can be used as a type, but cannot be instantiated, it can only be inherited, it helps to avoid code duplication and enforce the implementation of abstract methods
        // It also helps to hide the implementation details of the abstract class
        // Student is a Human, It inherits from Human
        Student student = new Student("John", 20, "123456");
        student.printInfo();
    }
}
