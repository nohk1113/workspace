package If_문제_1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        int num1=10;
        int num2=20;
        if(num1+num2>50){
            System.out.println("두 수의 합이 50보다 큽니다");
        }
        else {
            System.out.println("두 수의 합이 50이하 입니다.");
        }
    }
}
