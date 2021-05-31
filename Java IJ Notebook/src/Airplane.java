public class Airplane {
    // 필드
    private String Company;  // 제조 회사
    private String Type;     // 타입 정보
    private String ID;       // 식별 정보

    // 생성자
    public Airplane(String Company, String Type, String ID) {
        this.Company = Company;
        this.Type = Type;
        this.ID = ID;
    }

    // 메소드
    public String getCompany() {
        return this.Company;
    }
    public String getType() {
        return this.Type;
    }
    public String getID() {
        return this.ID;
    }
}
