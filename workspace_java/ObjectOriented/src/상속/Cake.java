package 상속;

public class Cake {
    public void eat(){
        System.out.println("케익을 먹습니다");
    }
}
// 메서드 오버라이딩(overriding)
// 상속관계에서 부모클래스의 메서드를 자식 클래스에서 재 정의 할 수 있음.(덮어 씌우기)
class Cheesecake extends Cake{
    public void eat(){
        super.eat();  // 부모 클래스의 eat()메서드 호출
        System.out.println("치즈 케익을 먹는다.");
    }
}
