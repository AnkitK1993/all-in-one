package practice.coreJava.designPatterns.builder;

public interface Builder {
    void buildCpu();
    void buildRam();
    void buildStoage();
    Computer getComputer();
}
