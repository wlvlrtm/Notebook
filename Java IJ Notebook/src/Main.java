import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> c = (count) -> { 
            if (count == 1) {
                System.out.println(count + " apple.");
            } 
            else if (count >= 2) {
                System.out.println(count + " apples.");
            }
            System.out.println();
        };

        c.accept(5);

        ToIntFunction<String> intFunction = (String val) -> {
            System.out.print("length(" + val + ") = ");
            return val.length();
        };

        System.out.println("ToIntFunction: ");
        System.out.println(intFunction.applyAsInt("10"));
        System.out.println(intFunction.applyAsInt("100"));
        System.out.println(intFunction.applyAsInt("1000"));


        UnaryOperator<String> unaryOperator = (String val) -> {
            System.out.print("length(" + val + ") = ");
            String result = "";
            result += val.length();
            return result;
        };


        System.out.println("UnaryOperator: ");
        System.out.println(unaryOperator.apply("10"));

        System.out.println();


        int arr[] = {1,2,3};
        System.out.println(Arrays.stream(arr));


    }
}
