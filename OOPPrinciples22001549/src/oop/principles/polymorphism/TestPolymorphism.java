package oop.principles.polymorphism;

import oop.principles.inheritance.Student;

public class TestPolymorphism {

    public static void main(String[] args) {

        // Poly means many, morphism means forms, Polymorphism means many forms

        Student student = new Student("John", 20, "123456");
        // printInfo() is a method of Human class, but it will be called from Student class because it is overridden
        student.printInfo();
        Teacher teacher = new Teacher("John", 20, "123456");
        // printInfo() is a method of Human class, but it will be called from Teacher class because it is overridden
        teacher.printInfo();

    }
}
