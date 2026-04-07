package practice.coreJava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Ankit",32));
        persons.add(new Person("Snehal",33));
        persons.add(new Person("Veena",57));
        persons.add(new Person("Hemant",59));

        //Get List of people above 50

        List<Person> oldies = persons
                .stream()
                .filter(p -> p.age>50)
                .collect(Collectors.toList());

        oldies.forEach(System.out::println);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
