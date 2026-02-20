package practice.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit","Snehal","Hemant","Veena","Antara");

        List <String> filteredNames = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames);

        StringBuilder s = new StringBuilder("Hi name is ");
        s.append("Ankit");
        System.out.println(s);
        s.insert(3,"my ");
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());

    }
}
