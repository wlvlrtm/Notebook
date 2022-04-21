import java.util.function.*;

public class FirstStringTest {
    public static void main(String[] args) {
        UnaryOperator<String> o = (String x) -> {
            FirstString firstString = new FirstString();
            String y;
            
            y = firstString.startsWith(x);

            return y;
        };

        System.out.println(o.apply("Hello World"));



    }
}
