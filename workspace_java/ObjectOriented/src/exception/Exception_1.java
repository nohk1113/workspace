package exception;

import java.util.Scanner;

// 예외 처리
/*
예외처리 문법
try{
  예외가 발생 할수도 있는 코드 작성
}catch(Exception e){
  예외 발생시 실행코드
}finally{         <<   생략 가능함
예외가 발생하든, 안하든 무조건 시행할 코드
}
* */
public class Exception_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.print("첫번째 : ");
            int a = sc.nextInt();
            System.out.print("두번째 : ");
            int b = sc.nextInt();

            System.out.println(a/b);
        }catch (Exception e){     // 예외에 대한 정보가 들어있는 클래스
            System.out.println(e.getMessage());   // 예외 발생 이유를 간단하게 문자로 전달해줌
            e.printStackTrace();  // 실행 결과
            System.out.println("오류 발생!!!");
        }
        System.out.println("프로그램 종료");
    }
}
