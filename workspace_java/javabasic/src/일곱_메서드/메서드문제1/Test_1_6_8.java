package 일곱_메서드.메서드문제1;

public class Test_1_6_8 {
    public static void main(String[] args) {
        test6(1, 2, 3);
        t7(10, 2);
        t8("집", "가고싶다");
    }
    //메서드 6번 문제
    public static void test6(int a,int b,int c){
        System.out.println(a*b*c);
    }
    //메소드 7번 문제
    public static void t7(int a,int b){
        System.out.println(a/b+" "+a%b);
    }
    //메소드 8번 문제
    public static void t8(String a, String b){
        System.out.println(a+b);
    }
}
