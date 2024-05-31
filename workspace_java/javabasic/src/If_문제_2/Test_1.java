package If_문제_2;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        int max;  //큰수
        int min;   //작은수


        System.out.print("숫자를 입력하세요.");
        int num=sc.nextInt();
        System.out.print("숫자를 입력하세요.");
        int num2=sc.nextInt();

        System.out.println("첫번째수 "+num);
        System.out.println("두번째수 "+num2);
        if (num>num2){
            max=num;
            min=num2;
        }
        else {
        max=num2;
        min=num;
        }
        System.out.println(max+">"+min);

    }
}
