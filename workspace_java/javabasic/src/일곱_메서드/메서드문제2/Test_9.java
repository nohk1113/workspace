package 일곱_메서드.메서드문제2;

public class Test_9 {
    public static void main(String[] args) {
        System.out.println(t9(5));
    }
    public static int t9(int a){
        int sum=0;
        for (int i=1;i<a+1;i++ ){
            if(i%2==1){
                sum=sum+i;
            }
        }
        return sum;
    }
}
