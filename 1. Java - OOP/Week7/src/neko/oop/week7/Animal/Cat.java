package neko.oop.week7.Animal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.print("Meow");
    }
}
