package practice.coreJava.designPatterns.builder;

public class MainBuilder {
    public static void main(String[] args) {
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector();
        computerDirector.construct(gamingComputerBuilder);

        Computer gamingComputer = gamingComputerBuilder.getComputer();
        gamingComputer.displayInfo();

    }
}
