package practice.coreJava.designPatterns.abstractFactory;

public interface CountryCarFactory {

    static CarFactory getCountryCarFactory(String location) {
        CarFactory carFactory = null;
        switch (location) {
            case "INDIA":
                carFactory = new IndianCarFactory();
                break;
            case "US":
                carFactory = new USCarFactory();
                break;
        }
        return carFactory;
    }
}
