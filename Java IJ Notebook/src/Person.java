import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    String name;
    int height;
    int weight;

    static List<Person> persons = Arrays.asList(
        new Person("황진이", 160, 45), 
        new Person("이순신", 180, 80), 
        new Person("김삿갓", 175, 65)
    );

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
