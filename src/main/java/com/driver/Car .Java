class Vehicle {
    String name;
    int currentSpeed;
    String currentDirection;
    Vehicle(String name, int currentSpeed, String currentDirection) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
    }
    void move() {
        System.out.println(name + " is moving at speed " + currentSpeed + " towards " + currentDirection);
    }
}
class Car extends Vehicle {
    int doors;
    Car(String name, int currentSpeed, String currentDirection, int doors) {
        super(name, currentSpeed, currentDirection);
        this.doors = doors;
   }
    void showDoors() {
        System.out.println(name + " has " + doors + " doors.");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Vehicle", 50, "North");
        Car c = new Car("Car", 80, "East", 4);
        v.move();
        c.move();
        c.showDoors();
    }
}
