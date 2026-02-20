package practice.designPatterns.factory;

public class Customer {

    private Vehicle vehicle;

    public Customer(VehicleFactory factory) {
        vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Customer twoWheelerCustomer = new Customer(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerCustomer.getVehicle();
        twoWheeler.printVehicle();
    }
}
