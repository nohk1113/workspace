package 여섯번째_배열.둘문제;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int arr=sc.nextInt();
        int[] num=new int[arr];

        for(int i=0; i< num.length;i++ ){
            num[i]=i+1;
            System.out.print(num[i]+" ");
        }
        int sum=0;
        for(int e: num){
            sum=sum+e;
        }
        System.out.println(" ");
        System.out.println(sum/(double)num.length);

    }
}
