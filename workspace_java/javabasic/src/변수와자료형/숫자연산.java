package 변수와자료형;

public class 숫자연산 {
    public static void main(String[] args) {
        System.out.println(10+10);
        // 정수끼리의 연산결과는 정수만 나옴
        System.out.println(10/4);
        //실수 끼리의 연산결과는 실수만 나옴
        System.out.println(10.0/4.0);
//실수와 정수를 연산하면 실수가 나옴
        System.out.println(10/4.0);
        // 나누기가 정수여서 결과 3에 *1.5 하면 실수와 하는 계산이라서 4.5의 결과가 나옴
        System.out.println(10/3*1.5);
    }
}
