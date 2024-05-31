package 네번째_조건문;

import java.util.Scanner;

public class 예제_3 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        //키보드를 정수 하나를 입력받아서  입력받은 정수가 3의 배수이면서 5의 배수일때만    '1'출력
        System.out.print("정수 입력: ");
        int num= sc.nextInt();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println(1);
        }

    }
}
