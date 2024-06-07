package If_문제_모음.If_심화문제;

import java.util.Scanner;

public class Tste_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x의 값 : ");
        int num = sc.nextInt();
        System.out.print("y의 값 :");
        int num1 = sc.nextInt();

        if (num < 100 && num1>50) {

            System.out.println("사각형 안에 점이 있습니다.");
        }

        else if(num > 100 && num1<50){
            System.out.println("오류");
        }
    }
}
