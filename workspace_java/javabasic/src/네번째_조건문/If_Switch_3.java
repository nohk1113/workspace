package 네번째_조건문;

import java.util.Scanner;

public class If_Switch_3 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        System.out.print("첫번째 숫자 :");
        int x=sc.nextInt();
        System.out.print("두번째 숫자 :");
        int y=sc.nextInt();
        System.out.print("연산자 : ");
        String oper=sc.next();

        // 문자가 + 와 같은가?
        if(oper.equals("+")){
            System.out.println(x + oper + y + "="+(x+y));
        }
        else if(oper.equals("*")){
            System.out.println(x + oper + y + "="+(x*y));
        }
        else if(oper.equals("/")){
            //                            double 을 정수 앞에 넣으면 실수로 만들어줌
            System.out.println(x + oper + y + "="+(x/(double)y));
        }
        else if(oper.equals("-")){
            System.out.println(x + oper + y + "="+(x-y));
        }
        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }
    }
}
