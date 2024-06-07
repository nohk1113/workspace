package If_문제_모음.If_문제_1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if (num % 5!=0){
            System.out.println("5의 배수를 입력하세요");
        }
    }
}
