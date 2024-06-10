package class_basic.car;

public class Cartest {
    public static void main(String[] args) {
        Car c1=new Car();   // 클래스 불러오는 법

        // c1 변수 출력
        System.out.println(c1.brand);// 객체명.변수명
        System.out.println(c1.price);// 객체명.변수명

        c1.brand="현대";  // 변수의 값 변경
        c1.price=100;

        System.out.println(c1.brand);// 객체명.변수명
        System.out.println(c1.price);// 객체명.변수명

        System.out.println();

        Car c2=new Car();
        c2.printCarInto();  // 모든 정보를 출력함(c2에 대한 정보만)
        c2.setBrand("기아");// 정보 변경
        c2.setModelName("K9");
        c2.setCarNumber("8282");
        c2.setPrice(1000);
        c2.printCarInto(); // 위에서 아래로 진행되어서 아래에 출력문 넣음
    }
}
