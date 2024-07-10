package test;

public class CalTest {
    public static void main(String[] args) {
        Calculate num=new Calculate();
        num.setNumber(20, 10);
//        두 정수의 합
        System.out.println(num.getSum());
//        두 정수중 큰수
        System.out.println(num.getMax());
//         두 정수 사이의 정수들의 평균
        System.out.println(num.getpl()/2);
    }
}
