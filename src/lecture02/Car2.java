package lecture02;

public class Car2 {
    int fuel;
    Tire[] tires = new Tire[4];
    Engine engine;


    Car2(Tire[] tires,Engine engine) {
        this.tires = tires;
        this.engine = engine;
        fuel = 0;
    }

    void run() {
        if (fuel <= 0) {
            System.out.println("走れませんでした。");
        }else {
            System.out.println("燃料を1消費して走りました。");
        }
    }

    void startEngine(){
        engine.start();
    }
}
