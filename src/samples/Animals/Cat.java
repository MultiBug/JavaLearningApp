package samples.Animals;
import samples.Animals.*;

public class Cat extends Animal {
    public Cat(String n) {
        super(n);
    }

    public Cat() {
        super();
    }

    public void makeSound() {
        System.out.println("Meow");
    }
    public void eat() {
        System.out.println("omnomnom");
    }
}
