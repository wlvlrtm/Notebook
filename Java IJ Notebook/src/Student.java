public class Student implements Human {
    int age;

    public Student(int age) {
        this.age = age;
    }


    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("도시락을 먹습니다.");
    }

    @Override
    public void print() {
        System.out.println(this.age + "세의 학생입니다.");
    }

}
