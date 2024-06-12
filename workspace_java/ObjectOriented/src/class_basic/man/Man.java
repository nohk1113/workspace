//    // 이름, 나이, 주소 변경하는 메서드 생성
//    public void setName(String name){
//        this.name=name;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//    public void setAdrr(String addr){
//        this.adrr=adrr;

//    }
/*클래스: 객체를 만드기 전 정의하는 객체의 성계도. 자료형이다!
클래스는 성계도이기 때문에 바로 사용이 불가하고 반드시 객체를 생성해서 사용
객체 생성 문법: 클래스명 객체명=new 생성자();
객체: 실세계의 모든 사물을 컴퓨터프로그래밍 언어로 모델링 한 형태
객체는 데이터(변수)와 기능(메서드)로 구성됨.

*클래스 구성요소: 멤버변수, 메서드의 정의, 생성자
 생성자: 클래스의 멤버변수의 값을 초기화 하기 위해 사용
   객체 생성시 최초 1회만 실행
   생성자 사용하는 때 = 클래스로 부터 객체를 사용할때!!!!!!!(반드시 사용해야함)
   클래스에는 반드시 하나 이상의 생성자가 있어야한다. 개발자가 직접 생성자를 하나도 선언하지 않았으면
   자동으로 기본생성자(디폴트 생성자)를 만들어준다.
   생성자는 필요에 의해 여러개 선언 할수 있음 (오버로딩 형식을 지켜야함

   접근제한자 = public , default, private
   멤버변수 및 메서드에 붙어서 접근의 범위를 지정

   this 키워드
   public void a(int money1){
   money=money1;
   **  변수의 정보를 알고싶을때 ctrl+마우스 오른쪽 클릭  **
   }
   */
//
////     리턴 하는 방법
////    setter : 멤버 변수 각각의 값을 변경하는 메서드
////    setter의 이름은 set변수명 으로 반드시 지정!!!
//
////    getter : 멤버변수 각각의 값을 return 받는 메서드

        package class_basic.man;

public class Man {
    private String name;
    private int age;
    private String adrr;

    public Man(String name, int age, String adrr) {
        this.name = name;
        this.age = age;
        this.adrr = adrr;
    }

    public String getAdrr() {
        return adrr;
    }

    public void setAdrr(String adrr) {
        this.adrr = adrr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMan() {
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println("주소 :" + adrr);
    }
}


//    public String getname(){
//        return name;
//    }
//    public int getage(){
//        return age;
//    }
//    public String getAdrr(){
//        return adrr;
//    }
//
//    public  void printMan(){
//        System.out.println("이름: "+name);
//        System.out.println("나이: "+age);
//        System.out.println("주소: "+adrr);
//    }











