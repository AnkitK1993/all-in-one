package practice.coreJava.designPatterns.abstractFactory;

public class USLuxuryCar extends Car {
    @Override
    public void construct() {
        System.out.println("Constructing USLuxuryCar");
    }
}
