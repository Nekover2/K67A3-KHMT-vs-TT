package neko.oop.week5;

public class Employee {
    private int id;
    private String firstName;
    private String LastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName() {
        return firstName + " " + LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnalSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary *= (int) (percent+100) / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
