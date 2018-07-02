package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

public class ConstructorRefs {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jaime");
        names.add("Jenny");
        names.add("Jackson");

        Stream<Person> stream = names.stream().map(Person::new);
        List<Person> people = stream.collect(Collectors.toList()); // takes value from stream and passes in function

        for (Person person: people) {
            System.out.println(person.getName());
        }

        // a cooler way of doing the things from above using an array
        Person[] p = stream.toArray(Person[]::new);
    }
}
