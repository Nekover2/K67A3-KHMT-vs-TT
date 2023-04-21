package neko.oop.week7.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.print("Woof");
    }

    public void greets(Dog anotherDog) {
        System.out.print("Woooof");
    }
}
