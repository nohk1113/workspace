package class_basic.man;

public class ManTest {
    public static void main(String[] args) {
        Man man=new Man("홍", 20, "울산");

        // 이름 변경
        man.setName("kim");  // 정보 입력, 주입
        System.out.println(man.getName()); // 출력
        man.printMan();
    }
}
