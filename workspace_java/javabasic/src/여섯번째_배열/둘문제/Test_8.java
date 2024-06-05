package 여섯번째_배열.둘문제;
// 랜덤 숫자를 배열
import java.util.Arrays;

public class Test_8 {
    public static void main(String[] args) {
        int[] arr=new int[6];

//        1.0<=x<46.0  실수

        for(int i=0; i<arr.length;i++){
           arr[i]=(int)(Math.random()*45 + 1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
