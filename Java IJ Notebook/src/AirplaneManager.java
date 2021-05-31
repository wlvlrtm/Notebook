import java.util.*;

public class AirplaneManager  {

    ArrayList<Airplane>List = new ArrayList<Airplane>();

    // 필드
    private static int num = 1;  // 등록순서

    // 메소드
    public void regist() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 아래 정보를 입력하세요. ===");

        System.out.print("비행기 제조회사: ");
        String Company = scanner.next();

        System.out.print("비행기 타입정보: ");
        String Type = scanner.next();


        System.out.println();        // 입력을 받음

        List.add(new Airplane(Company, Type, generateID(Company, Type)));
    }

    public static String generateID (String Company, String Type) {
        String a;
        String b;
        String c;

        if (Company.equals("아시아나") ) {
            a = "A";
            if (Type.equals("여객기")){
                b= "L";
            }
            else if (Type.equals ("전투기")) {
                b = "F";
            }
            else {
                b = "Z";
            }
        }
        else if (Company.equals("대한항공") ) {
            a = "K";
            if (Type.equals ("여객기")){
                b= "L";
            }
            else if (Type.equals ("전투기")) {
                b = "F";
            }
            else {
                b = "Z";
            }
        }
        else {
            a = "Z";
            if (Type.equals("여객기")){
                b= "L";
            }
            else if (Type.equals("전투기")) {
                b = "F";
            }
            else {
                b = "Z";
            }
        }
        c = String.format("%03d", num);
        return a + b + c;
    }

    public void showAll() {
        Iterator<Airplane> itr = List.iterator();

        while (itr.hasNext()) {
            Airplane D = itr.next();
            System.out.println("--------------------------");
            System.out.println("비행기 제조회사: " + D.getCompany());
            System.out.println("비행기 타입정보: "+ D.getType());
            System.out.println("비행기 식별번호: "+ D.getID());
        }
    }

    public static void main(String[] args) {
        AirplaneManager plane = new AirplaneManager();
        for(num = 1; num <= 3; num++) {
            plane.regist();
            plane.showAll();
        }
    }
}