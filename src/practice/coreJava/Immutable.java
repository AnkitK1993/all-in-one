package practice.coreJava;

import java.util.*;

public final class Immutable {

    private final int id;
    private final String name;
    private final List<String> certs;
    private final Map<String, String> metadata;

    public Immutable(int id, String name, List<String> certs, Map<String, String> metadata) {
        this.id = id;
        this.name = name;
        this.certs = certs;
        this.metadata = metadata;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCerts() {
        return Collections.unmodifiableList(certs);
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }
}

class Main {
    public static void main(String[] args) {
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("Ankit","K");
        tempMap.put("Snehal","C");
        Immutable immutable = new Immutable(1, "Ankit", Arrays.asList("Udemy", "AWS"), tempMap);

        System.out.println(immutable.getMetadata());
        immutable.getMetadata().put("Antara","J");
        System.out.println(immutable.getMetadata());


    }
}
