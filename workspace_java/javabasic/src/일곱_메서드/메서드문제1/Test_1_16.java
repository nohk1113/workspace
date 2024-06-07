package 일곱_메서드.메서드문제1;

public class Test_1_16 {
    public static void main(String[] args) {
        t16(5);
        t17(5,1);
    }
    public static void t16(int num){
        for (int i=0; i<num;i++){
            System.out.println(i);
        }
    }

    // 17번
    public static void t17(int a, int b){
        int max=a>b? a:b;
        int min=a<b? a:b;

        for(int i=min+1; i<max; i++){
            System.out.println(i);
        }
    }
}
