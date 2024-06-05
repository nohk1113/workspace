package 일곱_메서드;

public class Test_1_14 {
    public static void main(String[] args) {

    }
    public  static  void t14(int num){
        // 삼항 연산자
        int a= 10>5 ? 1:2;
        //  (참, 거짓) (1 = 참일때 실행할 내용) (2 = 거짓일때 실행하는 내용)

        if(num%2==0){
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }
        //윗줄과 같은 말
        System.out.println(num%2==0?"짝수":"홀수");
    }
}
