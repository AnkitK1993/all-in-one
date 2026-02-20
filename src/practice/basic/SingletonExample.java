package practice.basic;

public class SingletonExample {

    private static SingletonExample singletonExample;

    public static void main(String[] args) {
    SingletonExample s1 = SingletonExample.getInstance();
    SingletonExample s2 = SingletonExample.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }

    private SingletonExample(){}

    public static SingletonExample getInstance(){
        if(singletonExample==null)
            singletonExample=new SingletonExample();

        return singletonExample;
    }
}
