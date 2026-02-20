package practice.designPatterns.abstractFactory;

public class IndianCarFactory implements CarFactory {
    @Override
    public Car getCar(String type) {
        Car car = null;
        switch (type) {
            case "LUXURY":
                car = new IndianLuxuryCar();
                break;
            case "MINI":
                car = new IndianMiniCar();
                break;
        }
        return car;
    }
}
