import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        String[] ar = {"K", "o", "r", "e", "a", "n"};

        // 정렬 전 //
        System.out.print("정렬 전: ");
        for (String string : ar) {
            System.out.print(string + " ");
        }
        System.out.println();
        // -- //

        // 정렬 후 //
        System.out.print("정렬 후: ");

        Sort s = (String[] arr) -> { 
            Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); 
            return arr;
        };
        
        for (String string : s.sortToAlpha(ar)) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
