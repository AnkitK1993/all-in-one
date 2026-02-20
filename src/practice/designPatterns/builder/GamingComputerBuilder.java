package practice.designPatterns.builder;

public class GamingComputerBuilder implements Builder{
    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("i7 13th Gen");
    }

    @Override
    public void buildRam() {
        computer.setRam("32GB");
    }

    @Override
    public void buildStoage() {
        computer.setStorage("1TB");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
