package 네번째_조건문;

import java.rmi.Naming;
import java.util.Scanner;

public class Switch예제_1 {
    public static void main(String[] args) {
//        키보그로 정수 하나를 입력받아, 입력받은 값이 짝수이면 '1'출력 홀수이면'2'
        // 나머지는 '0'으로  출력
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int num=sc.nextInt();
        switch (num%2){
            case (0):
                System.out.println("1");
                break;

            case (1):
                System.out.println("2");
                break;

            default:
                System.out.println(0);
        }
    }
}
