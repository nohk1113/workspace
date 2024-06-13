package class_basic.Static;

public class InitTest {
    public static void main(String[] args) {
        StaticInit i1=new StaticInit();
        StaticInit i2=new StaticInit();
        StaticInit i3=new StaticInit();
//        static 변수를 읽고 사용하는 방법
//        객체면. 변수명으로 static 변수도 사용가능  (추천하지 않는 방법)
        System.out.println(i1.num);
        System.out.println(i2.num);
//        static 변수 및 메서드는 = 클ㄹㅐ스 명. 변수명 으로 접근
//        이러한 접근 방법은 객체를 만들지 않아도 사용가능
        System.out.println(StaticInit.num);

        System.out.println("10.5");
        Cnt out=new Cnt();  // 여기는 소숫점 가능함

        Math.random();
    }
}
