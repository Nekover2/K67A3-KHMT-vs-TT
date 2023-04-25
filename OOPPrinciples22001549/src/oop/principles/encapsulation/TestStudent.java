package oop.principles.encapsulation;

public class TestStudent {
    public static void main(String[] args) {

        // Encapsulation is used to hide the implementation details of a class from the user
        Student student = new Student("John", 20);
        student.printInfo();
        student.setAge(-1);
        student.printInfo();
    }
}
