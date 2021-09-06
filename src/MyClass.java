import samples.Animals.*;
import samples.Cars.*;
import samples.Other.*;
import java.util.ArrayList;

public class MyClass {
    static Object Colors;

    static void SayHello(String name) {
        System.out.println("Hello " + name);
    }
    static int sum(int val1, int val2) {
        return val1 + val2;
    }
    static int max(int a, int b) {
        if (a > b) {
           return a;
        }
        else {
            return b;
        }
    }
    static void addOneTo(int num) {
        num = num + 1;
    }
    public static final double PI = 3.14;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java");
        SayHello("");
        SayHello("David");
        SayHello("Amy");
        int x = sum(2, 5);
        System.out.println(x);
        int res = max(7, 42);
        System.out.println(res);
        Animal a = new Dog();
        Animal b = new Cat();
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);
        ((Cat)b).makeSound();
        b.eat();
        a.makeSound();
        b.makeSound();
        Animal dog = new Animal();
        dog.bark();
        Dog d = new Dog();
        d.eat();
        Vehicle v = new Vehicle("Blue");
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Green");
        v1.setColor("DarkRed");
        System.out.println(v1.getColor());
        Vehicle.horn();
        Machine m1 = new Machine() {
          @Override public void start() {
              System.out.println("Wooooo");
          }
        };
        Machine m2 = new Machine();
        m1.start();
        m2.start();
        int y = 5;
        addOneTo(y);
        System.out.println(y);
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT); // выводит 2, потому что 2 записи Counter
        System.out.println(PI);
        Rank SR = Rank.SOLDIER;
        Rank ST = Rank.SERGEANT;
        Rank CN = Rank.CAPTAIN;
        switch(CN) {
            case SOLDIER:
                System.out.println("Soldier says HI!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says HELLO!");
                break;
            case CAPTAIN:
                System.out.println("Captain says WELCOME!");
                break;
        }
        try {
            int t[] = new int[2];
            System.out.println(t[5]);
        }
        catch (Exception e) {
            System.out.println("An error occurred");
        }
        /*Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());*/
    }
}
