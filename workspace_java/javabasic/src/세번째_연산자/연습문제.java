package 세번째_연산자;

import java.text.DecimalFormat;
import java.util.Scanner;

//키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다
//단, 점수들은 정수만 입력한다고 가정한다.
//모든 입력받은 이름, 국어점수, 영어점수, 수학점수와 총점 및 평균을 출력   (korSocre, engScore, mathScore) 총합=(totalScore)  평균(avg)
public class 연습문제 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        System.out.print("당신의 이름과 점수들을 입력해 주세요.");
        System.out.print("이름: ");
        String name= sc.next();
        System.out.print("국어점수: ");
        int korSocre= sc.nextInt();
        System.out.print("영어점수: ");
        int engScore=sc.nextInt();
        System.out.print("수학점수: ");
        int mathScore=sc.nextInt();
        System.out.println("------------------입력 결과---------------------");
        System.out.println("국어점수: "+korSocre);
        System.out.println("영어점수: "+engScore);
        System.out.println("수학점수: "+mathScore);
        System.out.print("총점: "+(korSocre+engScore+mathScore)+"점"+" ");
        double avg= (korSocre+engScore+mathScore)/3.0;
        System.out.print(" 평균: "+ avg);
    }
}
