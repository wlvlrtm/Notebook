import java.io.*;
import java.util.*;

class AirplaneFinder {
    HashMap<String, Airplane> h = new HashMap<String, Airplane>();
    File f = new File("C:\\Java\\airplane.txt");

    // 메소드
    public void readAirplaneFile(String ID, String Company, int Passenger) {
        FileReader fin = null;
        try {
            fin = new FileReader(f);
            int c;
            while ((c = fin.read()) != -1) {
                h.put(ID, new Airplane(ID, Company, Passenger));
            }
            fin.close();
        }
        catch(IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }

    public void writeAirplaneFile() { // 파일 쓰기
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        try {
            fout =  new FileWriter(f, true);	 // 객체를 생성했어
            while (true){
                System.out.print("새로운 비행기 정보를 입력하시겠습니까? (Y/N): ");
                char choice = scanner.next().charAt(0);
                System.out.println();

                if (choice == 'Y') {
                    System.out.print("비행기 식별번호: ");
                    String ID = scanner.next();
                    System.out.print("비행기 제조회사: ");
                    String Company = scanner.next();
                    System.out.print("비행기 탑승인원: ");
                    int Passenger = scanner.nextInt();
                    System.out.println();

                    fout.write("\n" + ID + " ");
                    fout.write(Company + " ");
                    fout.write(String.valueOf(Passenger));
                }
                else if (choice == 'N') {
                    break;
                }
                fout.close();
            }
        }
        catch(IOException e) {
            System.out.println("파일 입출력 오류");
        }


    }
    public void findAirplane() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("검색할 비행기 식별번호를 입력하세요: ");
        String ID = scanner.nextLine();

        if (h.containsKey(ID)) {
            System.out.println(h.toString());
        }
        else {
            System.out.println("존재하지 않는 비행기 식별번호 입니다.");
        }
    }

    public static void main(String[] args) {
        AirplaneFinder plane = new AirplaneFinder();
        plane.readAirplaneFile("AL100", "아시아나", 100);
        plane.findAirplane();
        plane.writeAirplaneFile();
        plane.findAirplane();
    }

}