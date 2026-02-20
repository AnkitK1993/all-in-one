package practice.designPatterns.factory;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
