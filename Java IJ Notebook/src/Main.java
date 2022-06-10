import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = List.of("Hello", "world");
        Map<Boolean, List<String>> fruits = list.stream().collect(Collectors.partitioningBy(s -> s.length() == 2));
        System.out.println();

        
        List<List<Integer>> listOflists = List.of(List.of(1, 2), List.of(3, 4, 5));
        List<Integer> listOfIntegers = listOflists.stream().flatMap(item -> item.stream()).collect(Collectors.toList());
        System.out.println(listOfIntegers);        
        System.out.println();

        
        int[] arr = new int[]{1, 2, 3};
        IntStream arrI = Arrays.stream(arr);
        System.out.println();


        Stream<String> s1 = List.of("Hello, world", "Java").stream();
        //Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" ")));
        Stream<String[]> s3 = s1.map(s -> s.split(" "));
        Stream<String> s4 = s3.flatMap(Arrays::stream);
        System.out.println();
        

        IntStream.range(1, 5);          // 1, 2, 3, 4
        IntStream.rangeClosed(1, 5);    // 1, 2, 3, 4, 5
        System.out.println();


        List<Integer> scores = List.of(45, 76, 38, 27, 50);
        Stream<Integer> si = scores.stream();
        si.map(i -> i + 10).forEach(System.out::println);
        System.out.println();
        

        Stream<Integer> someStream = List.of(1, 2).stream();
        //someStream.count();
        someStream.map(i -> i).reduce((x, y) -> x+1).ifPresent(System.out::println);;
        System.out.println();

        Stream.of("a1", "a2", "a3")
            .map(s -> s.substring(1))
            .mapToInt(Integer::parseInt)
            .max()
            .ifPresent(System.out::println);
        System.out.println();


        Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0]+i[1]})
            .limit(10)
            .map(p -> p[0])
            .forEach(System.out::println);
        System.out.println();

        InputStream is  = System.in;
        char  c = (char) is.read();
        System.out.println(c);

        FileOutputStream fos = new FileOutputStream("");
        FileChannel fc = fos.getChannel();

        File file = new File("/java/system");
        System.out.println(file.getName());


        

    }

}
