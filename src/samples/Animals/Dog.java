package samples.Animals;
import samples.Animals.Animal;

public class Dog extends Animal {
    public Dog() {
        legs = 4;
    }
    public void makeSound() {
        System.out.println("Woof");
    }
}