package 상속;

public class PhoneTest {
    public static void main(String[] args) {
        MobilPhon m1=new MobilPhon();
        SmartPhone sp1=new SmartPhone();

//        부모 클래스로는 자식 클래스의 객체를 받을수 있음.
//        다형성으로 생성된 객체는 부모 클래스의 변수, 메서드만 사용 가능
        MobilPhon m2=new SmartPhone();
//        SmartPhone sp2=new MobilPhon();     * 오류 *
//        m2.playApp();
        m2.sendMsg();
//         어려우면 외우기...(왼쪽이 부모이면 가능함!!)
//        다형성 >> 오버라이딩(Overriding)
    }
}
