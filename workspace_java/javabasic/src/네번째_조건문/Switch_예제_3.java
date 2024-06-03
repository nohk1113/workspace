package 네번째_조건문;
/*
점수로 키보드로 입력받는다
키보드로 입력받은 점수가   90<=x <=100'A'출력
키보드로 입력받은 점수가   80<=x <=89'B'출력
키보드로 입력받은 점수가   70<=x <=79'C'출력
x<70 'D' 출력
* */

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_예제_3 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        System.out.print("점수를 입력하시오 : ");
        int score=sc.nextInt();

        switch (score/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
            default:
                System.out.println("D");
        }
    }
}
/*  if: 조건이 범위일때
* case:  값이 정해져 있을때*/