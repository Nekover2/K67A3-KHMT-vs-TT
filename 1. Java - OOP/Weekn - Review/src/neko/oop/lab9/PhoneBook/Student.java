package neko.oop.lab9.PhoneBook;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastname;
    private String phone;
    private double average;


    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    @Override
    public int compareTo(Student o) {
        return Double.compare(this.average, o.average);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Double.compare(student.average, this.average) == 0
                && Objects.equals(this.name, student.name)
                && Objects.equals(this.lastname, student.lastname)
                && Objects.equals(this.phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", lastname=" + lastname + ", phone=" + phone + ", average=" + average + "]";
    }
}
