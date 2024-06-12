package 상속;

import java.util.zip.DeflaterOutputStream;

// 상속: 부모 클래스의 멤버 변수와 메서드를 물려받는것
// Man: 부모 클래스, 수퍼 클래스, 상위클래스
// BusinessMan : 자식 클래스, 서브 클래스, 하위 클래스
// 상속 사용 이용: 코드의 재활용
// 연관성이 없는 다수의 클래스들에 연관성을 부여하여 데이터의 관리를 효율적으로 할수있게 만드는 기능.
public class Man {
    String name;

    public Man(){}

    //생성자
    public Man(String name){
        this.name=name;
    }

    public void telName(){
        System.out.println("이름은 홍길동입니다");
    }
}
// 상속 받은 클래스의 생성자 가장 첫번째 중에는 super()라는 메서드가 숨겨져 있다
// super(): 부모 클래스의 기본(디폴트) 생성자를 호출
class BusinessMan extends Man{
    String company;

    // 생성자
    public BusinessMan(){
//        여기에 super() 라는 키워드가 숨겨져 있다
//        super(); << 아무것도 없는 생성자를 불러오는 것이라서 부모클래스에 아무것도 없는 생성자가 필요함
        System.out.println("생성자 호출");
    }

    public void tellCompany(){
        System.out.println("저는 삼성에 다닙니다");
    }
}
