package oop.principles.inheritance;

public class TestEncapsulation {

    public static void main(String[] args) {
        // Student is a Human, It inherits from Human
        // Inheritance is used to avoid code duplication, it helps to reuse code, it also helps to hide the implementation details of the parent class
        Student student = new Student("John", 20, "123456");
        student.printInfo();
    }
}
