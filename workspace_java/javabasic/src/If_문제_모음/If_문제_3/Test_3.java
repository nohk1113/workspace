package If_문제_모음.If_문제_3;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오");
        int num=sc.nextInt();

        // 십의 자리
        int tens=num/10;
        // 일의 자리
        int ones=num%10;
        // 박수의 횟수
        int clapCnt=0;
        //십의 자리가 3, 6, 9면 clapCnt를 1증가
        // && -->그리고 라서 ||-->이거나!!!!
        if (tens==3 || tens==6 || tens==9){
            clapCnt++;     // 같은말  clapCnt= clapCnt + 1, ++clapCnt
        }
        //일의 자리가 3, 6, 9면 clapCnt를 1증가
        if (ones==3 || ones==6 || ones==9){
            clapCnt++;
        }
        //clapCnt의 값에 따라 출력
        switch (clapCnt){
            case 1:
                System.out.println("박수 짝");
                break;
            case 2:
                System.out.println("박수 짝 짝");
        }
    }
}
