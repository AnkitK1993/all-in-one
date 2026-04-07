package practice.coreJava.designPatterns.abstractFactory;

public class USMiniCar extends Car {
    @Override
    public void construct() {
        System.out.println("Constructing USMiniCar");
    }
}
