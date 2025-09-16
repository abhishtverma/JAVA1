package OOPs.Polymorphism;

// this is overriding 
public class Car2 extends Vehicle2 {
    @Override
    public void service() {

        super.service();
        System.out.println("Car needs a service.");
    }

    public static void main(String[] args) {
        Car2 car = new Car2();
        Vehicle2 veh = new Vehicle2();
        car.service();
        veh.service();
    }
}
