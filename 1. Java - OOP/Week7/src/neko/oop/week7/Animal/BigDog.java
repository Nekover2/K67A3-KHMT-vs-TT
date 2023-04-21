package neko.oop.week7.Animal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.print("Woow");
    }

    @Override
    public void greets(Dog anotherDog) {
        System.out.print("Woooooow");
    }

    public void greets(BigDog anotherBigDog) {
        System.out.print("Woooooooooow");
    }
}
