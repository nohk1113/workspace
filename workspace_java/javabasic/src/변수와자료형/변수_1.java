package 변수와자료형;

public class 변수_1 {
    // main 적으면 첫시작 문장이 자동완성
    //sout 치면 입력문장 자동완성
    public static void main(String[] args) {
        //변수를 사용하기위해서는 먼저 변수를 선언해야 함
//변수는 값을 저장할 수 있는 공간
        //변수 선언 문법: 자료형(data type) 변수형;
        int num; //정수를 저장할 공간 num 선언
        //   = (대입연산자)우측의 값을 왼쪽에 저장(대입한다)
        num = 5;
//        num = 1.5;    <--오류
        System.out.println("num");
        System.out.println(num);
        System.out.println("num="+num);
//하나의 변수에는 하나의 값만 저장,  가장 최근에 대입한 값만 저장함
        num=10;
        System.out.println("num="+num);
    }
}
