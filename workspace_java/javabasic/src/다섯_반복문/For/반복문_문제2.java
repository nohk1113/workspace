package 다섯_반복문.For;

import java.util.Scanner;

public class 반복문_문제2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("첫번째수 : ");
        int num1= sc.nextInt();
        System.out.println("두번째수 : ");
        int num2= sc.nextInt();
        // 큰수, 작은수 결정
        int max, min;
        if (num1>num2){
            max=num1;
            min=num2;
        }
        else {
            max=num2;
            min=num1;
        }
//        min = 1, max = 10   2~9까지의 합
        int sum=0;
        for (int i=min+1; i<max; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
