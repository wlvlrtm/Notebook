import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws Exception {
        File inFile = new File("C:\\Users\\kimsk\\Documents\\Dev-Study\\Programming-Study\\Notebook\\Java IJ Notebook\\input.txt");
        File outFile = new File("C:\\Users\\kimsk\\Documents\\Dev-Study\\Programming-Study\\Notebook\\Java IJ Notebook\\output.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        PrintWriter writer = new PrintWriter(new FileWriter(outFile));

        String string;

        while((string = reader.readLine()) != null) {
            System.out.println(string.toUpperCase());
            writer.write(string.toUpperCase());
        }
        writer.close();
    }
}
