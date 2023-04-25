package oop.principles.polymorphism;

public class Teacher extends Human{

    private String id;
    //constructor

    public Teacher(){
        super();
        this.id = "Unknown";
    }

    public Teacher(String name, int age, String id){
        super(name, age);
        this.id = id;
    }

    //getter and setter

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    //overriding

    @Override
    public void printInfo(){
        System.out.println("Teacher info:");
        super.printInfo();
        System.out.println("ID: " + id);
    }
}
