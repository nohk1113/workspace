package 일곱_메서드.메서드_심화_문제;

import java.util.Arrays;

public class Test_9 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] result=test(a);
        System.out.println(Arrays.toString(result));

    }
    public static int[] test(int[] arr){
        // 매개 변수로 넘어온 배열 요소중 짝수의 개수!!
        int cnt=0;
        for (int e:arr){
            if(e%2==0){
                cnt++;    // 짝수가 맞은면 cnt+1, 즉 짝수의 갯수
            }
        }
        int[] resultA=new int[cnt];   // 짝수만 저장될 배열 생성

        int index=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                resultA[index]=arr[i];
                index++;
            }
        }
        return resultA;
    }

}
