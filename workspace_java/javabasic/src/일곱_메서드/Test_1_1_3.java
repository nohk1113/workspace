package 일곱_메서드;

public class Test_1_1_3 {
    public static void main(String[] args) {
        test1();
        test2();  t2();
        test3(10);
        test4("안농");
        test5(2, 3);
    }
    // 1번 메소드문제
    public static void test1(){
        System.out.println("안녕하세요");
    }
    // 2번 메소드 문제
    public static void test2(){
        System.out.print("반갑습니다 .");
    }
    public static void t2(){
        System.out.println(" 어서오세요.");
    }

    //3번 매소드 문제
    public static void test3(int x){
        System.out.println(x);
    }
    //4번  메소드 문제
    public static void test4(String x){
        System.out.println(x);
    }
    //5번 메소드 문제
    public static void test5(int a, int b){
        System.out.println(a+b);
    }

}
