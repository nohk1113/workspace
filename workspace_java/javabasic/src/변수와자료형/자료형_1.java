package 변수와자료형;
//!!!!!!!!!!!!!!!!!!!!!!!!!!자료형이 다르면 데이터 저장 불가!!!!!!!!!!!!!!!!!!!!!

//자바는 크게 기본 자료형과 참조자료형으로 데이터의 형태를 구분
// 자바에서 기본 자료형은 총 8개.
// 참조 자료형은 무한대.

// 기본자료형
// 정수 타입: byte, short, int, long
//실수 타입: float, double
//논리 타입: boolean
//문자 타입: char

//------------------------------------------
// 문자 열 타입: String      !!!!!!!!!!!!!!!!!!!!!!!! 기본 자료형 아님!!!!!!!!!참조자료형은 대문자로 시작
public class 자료형_1 {
    public static void main(String[] args) {
        byte n1= 100;
//        byte n2= 1000;   이건 오류
        double n3= 10.5;
        boolean b1= true;
        boolean b2= false;
        //주의 사항 boolean은 쌍따옴표 없음 = ""
        // 문자열 (0개 글자 이상)+ ("쌍따옴표로 감싸야함")
         String s1= "java";
         String s2="false";
//         String s2=false;  <<-- 자료형 불일치
         //문자  (한 글자+ 홀따옴표로 감싸야한다)
        char c1= 'j';
        System.out.println("c1+="+c1);
        char c2=65;
        System.out.println("c2+="+c2);

        char c3= 'A';
        int c4= c3;
        System.out.println("c3="+c3);
        System.out.println("c4="+c4);

        String aaa= "A";
    }
}
