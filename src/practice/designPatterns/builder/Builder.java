package practice.designPatterns.builder;

public interface Builder {
    void buildCpu();
    void buildRam();
    void buildStoage();
    Computer getComputer();
}
