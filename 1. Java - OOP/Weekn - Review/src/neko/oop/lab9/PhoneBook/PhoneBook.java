package neko.oop.lab9.PhoneBook;

public interface PhoneBook {
    Student searchByName(String name);

    Student searchByLastName(String lastname);

    Student searchByNumber(String phone);

    void addPerson(Student student);

    void deleteByNumber(String phone);
}


