package class_basic.MultiTest;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();  // 정보를 불러오는 방법
        System.out.println(s1.name);


        // 학생 전체정보 출력
        s1.setName("킴");
        s1.introduce();
        s1.age=20;   // 쓰면 안됨!!!!
        s1.setAge(20);

    }
}
