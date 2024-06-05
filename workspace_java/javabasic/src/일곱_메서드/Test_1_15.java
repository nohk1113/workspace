package 일곱_메서드;

public class Test_1_15 {
    public static void main(String[] args) {
        t15(10, 50);
    }
    public static void t15(int a, int b){
        if(a%2==0 && b%2==0){
            System.out.println("둘 다 짝수 ");
        }
        else if(a%2 !=0 && b%2!=0){
            System.out.println("둘 다 홀수");
        }
        else {
            System.out.println("하나만 짝수");
        }
    }
}
