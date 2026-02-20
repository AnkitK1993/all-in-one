package practice.designPatterns.abstractFactory;

public class IndianLuxuryCar extends Car {
    @Override
    public void construct() {
        System.out.println("Constructing IndianLuxuryCar");
    }
}
