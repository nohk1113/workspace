package 일곱_메서드;

public class 메서드_5 {
    public static void main(String[] args) {
        int result=getSum(10, 20);
        System.out.println(result);

        System.out.println(getSum(20, 40));

        double result2=getSum2(10, 20);
    }
    public  static int getSum(int a, int b){
        return a+b;
    }
    // 정수의 합을 실수형태로 리턴하는 메서드
    public  static double getSum2(int a, int b){
        return a+(double)b;   // 정수와 실수만 괄호로 써서 변환이 가능 !!!!
    }
}
