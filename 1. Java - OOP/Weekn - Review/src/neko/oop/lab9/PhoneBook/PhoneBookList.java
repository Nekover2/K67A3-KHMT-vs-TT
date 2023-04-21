package neko.oop.lab9.PhoneBook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {

    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }


    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student student : phoneBook) {
            if (student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phone)) {
                phoneBook.remove(student);
                break;
            }
        }
    }
}
