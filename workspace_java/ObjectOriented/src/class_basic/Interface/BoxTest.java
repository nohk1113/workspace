package class_basic.Interface;

public class BoxTest {
//    wrapper 클래스: 기본 자료형을 클래스로 표현한 것.
//       wrapper 클래스는 기본자료형처러 ㅁ사용하면 된다.
//    int  -> Integer
//    double -> Double
//    boolean ->  Boolean
//    float -> Float
public static void main(String[] args) {
//     정수 10을 클래스 화
    Integer a= Integer.valueOf(10);
    Integer c=10;

    Box b= new Box();
    b.setBox(10);  //   10 을 입력하면 -> Integer 이렇게 변환을 해준다
}
}
