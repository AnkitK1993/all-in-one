package practice.coreJava.designPatterns.abstractFactory;

public class USCarFactory implements CarFactory {
    @Override
    public Car getCar(String type) {
        Car car = null;
        switch (type) {
            case "LUXURY":
                car = new USLuxuryCar();
                break;
            case "MINI":
                car = new USMiniCar();
                break;
        }
        return car;
    }
}
