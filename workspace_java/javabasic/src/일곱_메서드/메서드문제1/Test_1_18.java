package 일곱_메서드.메서드문제1;

public class Test_1_18 {
    public static void main(String[] args) {
        t18(1,10);
        t19("집에가자",10);
    }
    public static void t18(int a, int b){
        int max=a>b? a:b;
        int min=a<b? a:b;

        int cnt=0;
        for(int i=min+1; i<max; i++){
            if(i%5==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    // 19번 문제
    public static void t19(String s, int n){
        String result="";  // 빈 문자인 상태..
        for(int i=0; i<n;i++){
            result=result+s; // 여기서 빈문장에 s인 문자가 더해지는 거임!!!!
        }
        System.out.println(result);
    }

}
