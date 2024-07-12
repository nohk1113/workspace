package Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {


// 1 ~ 999까지의 수 중 임의의 숫자를 Scanner를 통해 입력 받아, 입력받은 숫자의 369게임 결과를 출력하는
//    프로그램을 만드시오. 만약 박수가 없는 숫자라면 ‘박수 0번’, 박수 한 번이라면 ‘박수 1번’, 박수 두 번이라면 ‘박
//    수 2번’, 박수가 3번이면 ‘박수 3번’이라는 문자열을 출력하면 된다. 단, 키보드로 숫자를 입력받을 때 1 ~ 999
//    까지 숫자 이외의 데이터는 입력받지 않는다고 가정한다.
    Scanner sc=new Scanner(System.in);
        System.out.print("숫자를 입력하시오");
    int a=sc.nextInt();
        int hun=a/100;
        int tens=(a%100)/10;
    // 일의 자리
    int ones=a%10;
    // 박수의 횟수
    int clapCnt=0;

    //일의 자리가 3, 6, 9면 clapCnt를 1증가

        if (ones==3 || ones==6 || ones==9) {
            if (tens == 3 || tens == 6 || tens == 9) {
                if (hun == 3 || hun == 6 || hun == 9 && hun!=0) {


                    clapCnt++;     // 같은말  clapCnt= clapCnt + 1, ++clapCnt
                }
                clapCnt++;
            }
            clapCnt++;
        }
    //clapCnt의 값에 따라 출력
        switch (clapCnt){
        case 1:
            System.out.println("박수 짝");
            break;
        case 2:
            System.out.println("박수 짝 짝");
            break;
        case 3:
            System.out.println("박수 짝 짝 짝");
        }
    }
}

