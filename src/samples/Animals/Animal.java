package samples.Animals;
import samples.*;

public class Animal {
    String name;
    public Animal(String n) {
        name = n;
    }
    public Animal() {}
    public void bark() {
        System.out.println("Woof-Woof");
    }
    protected int legs;
    public void eat() {
        System.out.println("Animal eats");
    }
    public void makeSound(){
        System.out.println("Grr...");
    }
}
