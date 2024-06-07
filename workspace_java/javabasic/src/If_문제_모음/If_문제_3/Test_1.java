package If_문제_모음.If_문제_3;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        System.out.println("첫번째 변의 길이 :");
        int a= sc.nextInt();
        System.out.println("두번째 변의 길이 :");
        int b= sc.nextInt();
        System.out.println("세번째 변의 길이 :");
        int c= sc.nextInt();

        if (a+b>c && a+c>b && b+c>a ){
            System.out.println("삼각형 가능");
        }
        else {
            System.out.println("삼각형 불가능");
        }
    }
}
