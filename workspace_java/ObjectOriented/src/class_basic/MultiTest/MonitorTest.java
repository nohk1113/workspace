package class_basic.MultiTest;
// 객체 만드는 문법 매우 중요함
public class MonitorTest {
    public static void main(String[] args) {
        // 모니터 설계도에서 모니터 객체를 생성
        // 객체 생성 문법 : 클레스명 객체명= new 클래스명();
        Monitor m1=new Monitor();
        // 객체의 정보(변수)값을 확인하는 방법
        // 문법 : 객체명.변수명;
        System.out.println(m1.brend);// m1 모니터의 브랜드명 출력
        System.out.println(m1.price);
        System.out.println(m1.color);

        Monitor m2=new Monitor();
        m2.price=1000;
        m2.brend="삼성";
        m2.color="블랙";
        System.out.println(m2.price);
        System.out.println(m2.color);
    }
}
