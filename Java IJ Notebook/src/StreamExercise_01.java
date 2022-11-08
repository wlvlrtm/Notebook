import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;

// 문자열을 텍스트 파일에 저장하기

public class StreamExercise_01 {    
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("/Users/araina/Documents/Programming-Study/Notebook/Java IJ Notebook/tmp/text.txt");
        fileWriter.write("Hello, World!");
        fileWriter.close();
        
        InputStream in = new FileInputStream("/Users/araina/Documents/Programming-Study/Notebook/Java IJ Notebook/tmp/text.txt");
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder builder = new StringBuilder();

        char[] a = new char[1024];
        while(true) {
            int count = reader.read(a);
            if (count == -1) {
                break;
            }
            builder.append(a, 0, count);
        }
        reader.close();
        System.out.println(builder.toString());
    }    
}
