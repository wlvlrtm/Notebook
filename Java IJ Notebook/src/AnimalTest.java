import java.util.function.Supplier;

public class AnimalTest {



    public static void main(String[] args) {
        // soundAnimal() Call

        Animal animal = new Animal();
        
        


    }

    private static void soundAnimal(Supplier<Animal> s) {
        System.out.println(s.get());

    }
}
