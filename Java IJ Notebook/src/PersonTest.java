import java.util.List;
import java.util.function.ToIntFunction;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("평균 신장 : " + average(Person.persons, p -> p.getHeight()));
        System.out.println("평균 체중 : " + average(Person.persons, p -> p.getWeight()));

    }

    public static double average(List<Person> persons, ToIntFunction<Person> function) {
        double sum = 0.0;
        double result;
        for (Person person : persons) {
            sum += function.applyAsInt(person);
        }

        result = sum/persons.size();

        return result;
    }





}
