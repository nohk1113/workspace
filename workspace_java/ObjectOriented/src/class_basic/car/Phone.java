package class_basic.car;
/*
접근 제한자 : 클래스, 메서드, 멤버변수 에서 사용
1 public : 프로젝트 내에 존재하면 접근 가능
2 default : 같은 패키지 내에 있으면 접근 가능
3 protected
4 private : 변수, 메서드가 선언 된 클래스 안에서만 접근 가능

 멤버 변수에는 무조건 private
 메서드는 무조건 public
 */

public class Phone {
     int prise;
    public String modelName;  // 멤버 변수이다
    String brand;

    // 생성자
    public Phone(){
        // this를 붙이는 이유는 이름이 중복되어서 값을 같이 주게 되면 원하는 곳에 넣기위해...
        this.prise=0;
        this.modelName="";
    }

    public void setPrise(int prise) {
        if (prise < 0) {
            this.prise = 0;
        }
        else{
            this.prise = prise;
        }
    }
}
