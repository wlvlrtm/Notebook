
// 리스트 1: 1 - 4 - 5 - 8
// 리스트 2: 2 - 3 - 5 - 7- 9

public class Main {
    public static void main(String[] args) {

        ListCal cal = new ListCal();


        // Result
        System.out.println("리스트 1: " + cal.getList1());
        System.out.println("리스트 2: " + cal.getList2());
        
        System.out.println();

        System.out.println("통합 리스트: " + cal.getListR());
    }
}