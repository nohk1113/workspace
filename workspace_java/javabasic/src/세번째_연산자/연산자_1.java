package 세번째_연산자;

public class 연산자_1 {
    public static void main(String[] args) {
        // 산술 연산자 : + - * /  %(나머지를 구하는 연산)
        // % mod 연산자
        System.out.println(10/4);
        System.out.println(10%4);
        System.out.println(10%3);
//비교 연산자
//        ==  같다,  !=같지않다, >=  크거나 같다, <=작거나 같다
        System.out.println(5>=3);

        //논리 연산자(맞다, 틀리다)(참, 거짓)
        //x가 5보다 크고 10 이하다   5<x<=10
        // && 그리고 , || 이거나(엔터키 위에 부호)
        int x=7;
        boolean r1=x>5 && x<=10;



    }
}
