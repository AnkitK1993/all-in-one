package practice.coreJava.designPatterns.builder;

import java.util.Objects;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(cpu, computer.cpu) && Objects.equals(ram, computer.ram) && Objects.equals(storage, computer.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, storage);
    }

    public void displayInfo() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("STORAGE: " + storage);
    }
}
