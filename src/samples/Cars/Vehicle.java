package samples.Cars;
import samples.*;

public class Vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    public Vehicle() {
        this.setColor("Red");
    }
    public Vehicle(String c) {
        this.setColor(c);
    }
    public  String getColor() {
        return color;
    }
    public void setColor(String c) {
        this.color = c;
    }
    private double fuelCapacity;

    public static void horn() {
        System.out.println("Beep!");
    }
}
