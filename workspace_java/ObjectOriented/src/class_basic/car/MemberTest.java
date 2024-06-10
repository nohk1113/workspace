package class_basic.car;

public class MemberTest {
    public static void main(String[] args) {
        Member m1=new Member();

        m1.setNameInfo("자바", "java", "1010", 20);
        m1.printCarInto();
        m1.setName("홍길동");
        m1.printCarInto();
//        System.out.println(m1.name);
//        System.out.println(m1.id);
//        System.out.println(m1.pasward);
//        System.out.println(m1.age);

//        m1.name="미미";
//        System.out.println(m1.name);
//
//        m1.printCarInto();
    }
}
