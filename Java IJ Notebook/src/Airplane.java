public class Airplane {
    //필드
    private String ID;       // 식별 번호
    private String Company;  // 제조 회사
    private int Passenger;  // 탑승 인원

    // 생성자
    public Airplane(String ID, String Company, int Passenger) {
        this.ID = ID;
        this.Company = Company;
        this.Passenger = Passenger;
    }

    // 메소드
    public String getID() {
        return this.ID;
    }
    public String getCompany() {
        return this.Company;
    }
    public int getPassenger() {
        return this.Passenger;
    }

    @Override
    public String toString() {
        return  ID + " " + Company + " " + Passenger;
    }
}


