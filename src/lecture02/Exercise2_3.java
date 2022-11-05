package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = {new Tire(65),new Tire(65),new Tire(65),new Tire(65)};
        Engine engine = new Engine(4000);
        Car2 car = new Car2(tires,engine);
        GasStation2 gasStation = new GasStation2();
        gasStation.refuel(car);
        car.startEngine();
        car.run();
    }
}
