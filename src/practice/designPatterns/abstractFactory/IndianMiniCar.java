package practice.designPatterns.abstractFactory;

public class IndianMiniCar extends Car {
    @Override
    public void construct() {
        System.out.println("Constructing IndianMiniCar");
    }
}
