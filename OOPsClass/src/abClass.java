abstract class Vehicle {
    abstract void accelerate();
    // abstract methos those no have any body
    abstract void breaks();
    abstract void wheels();
}
// let's create a subClass to access abstract class in java
class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Accelerate Ho gya");
    }
    @Override
    void breaks() {
        System.out.println("Just Breaks");
    }
    @Override
    void wheels() {
        System.out.println(5);
    }
}

public class abClass {
    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle();
        Car car = new Car();
        car.accelerate();
        car.breaks();
        car.wheels();



    }
}
