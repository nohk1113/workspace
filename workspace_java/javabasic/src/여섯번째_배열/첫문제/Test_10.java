package 여섯번째_배열.첫문제;

import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int num1=sc.nextInt();
        System.out.print("숫자를 입력하세요 :");
        int num2=sc.nextInt();
        System.out.print("숫자를 입력하세요 :");
        int num3=sc.nextInt();
        System.out.print("숫자를 입력하세요 :");
        int num4=sc.nextInt();
        System.out.print("숫자를 입력하세요 :");
        int num5=sc.nextInt();
        int[] x={num1, num2, num3, num4, num5};
        for(int i=0; i<x.length;i++){
            System.out.println(x[i]);
        }

    }
}
