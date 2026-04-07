package practice.coreJava;

public interface InterfaceExample {

    void process();

    default void show(){
        System.out.println("In default method");
    }

    static void display(){
        System.out.println("In display method");
    }
}

class TestDefault implements InterfaceExample{

    public static void main(String[] args) {
        TestDefault testDefault = new TestDefault();
        testDefault.process();
        testDefault.show();
        InterfaceExample.display();
    }

    @Override
    public void process() {
        System.out.println("Implementing process");
    }
}
