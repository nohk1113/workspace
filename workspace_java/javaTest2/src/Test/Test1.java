package Test;

import java.util.Scanner;

public class Test1 {
//    세 정수를 Scanner로 입력받아 큰 수부터 나열하여 출력하는 프로그램을 작성하시오. 단 입력받는 세 수는 중복
//    값이 없다고 가정한다. (클래스명 : Test1.java)
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("정수를 입력하시오 :");
    int a=sc.nextInt();
    System.out.print("정수를 입력하시오 :");
    int b=sc.nextInt();
    System.out.print("정수를 입력하시오 :");
    int c=sc.nextInt();

    int max, mid, min;
    if (a>b && a>c){
        max=a;
        if(b>c){
            mid=a;
            min=c;
        }
        else {
            mid=c;
            min=b;
        }
    }
    else if (b>a && b>c){
        max=b;
        if(a>c){
            mid=a;
            min=c;
        }
        else {
            mid=c;
            min=b;
        }
    }
    else {
        max=c;
        if(a>b){
            mid=a;
            min=b;
        }
        else {
            mid=b;
            min=a;
        }
    }
    System.out.println(max+">"+mid+">"+min);
    }
}

