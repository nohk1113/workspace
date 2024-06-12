package class_basic.MultiTest;
// 좋은 조건의 여건
// 멤버 변수는 반드시 초기값을 설정!!
// 초기값 설정은 멤버변수의 선언과는 별도로 진행!!
public class Account {
    String accNumber;
    String owner;
    int money;
//    생성자(변수의 초기화)    는 제목이랑 이름 똑같이 작성해야함

//    생성자 : 선언한 변수의 값을 초기화할 용도로 사용
//    public 클래스명(){}

//    클래스 안에는 반드시 생성자가 존재해야함!!!
//    만약 클래스 안에 생성자를 하나도 선언하지 않았다면 눈에 보이지 않는 기본
//    생성자를 자동으로 만들어줌(내용도 없고 매개변수도 없는 생성자)
    // 생성자는 여러개 만들수 있음
    public Account(){
        accNumber="미정";
        owner="미정";
        money=10000;
    }
    public Account(int a){
        money=a;
    }

    // 모든 변수의 값을 초기화 하는 메서드
    public void setAcconunt(String accNumber1, String owner1, int money1){
        // 이 클래스에서 선언한 accNumber
        this.accNumber=accNumber1;
        this.owner=owner1;
        this.money=money1;
    }
    public void printAccount(){
        System.out.println("계좌번호 : "+this.accNumber);
        System.out.println("계좌 주 : "+owner);
        System.out.println("예금액"+money);
    }
}
