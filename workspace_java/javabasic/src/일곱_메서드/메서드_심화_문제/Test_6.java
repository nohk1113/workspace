package 일곱_메서드.메서드_심화_문제;
// 최대값 구하기

import java.net.SocketTimeoutException;

public class Test_6 {
    public static void main(String[] args) {
        int[] a={1,4,7,5,2};
        int max=test(a);
        System.out.println(max);
    }
    public static int test(int[] a){
        int max=0;
        for (int i=0; i<a.length; i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
