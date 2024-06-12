package 상속;

public class CakeTest {
    public static void main(String[] args) {
        Cheesecake c=new Cheesecake();
        c.eat();   // 자식 클래스에서 재정의한 메서드가 실행
        // c객체로 부터 부모 클래스에서 선언한 eat메서드를 호출할수 없다!!!
    }
}
