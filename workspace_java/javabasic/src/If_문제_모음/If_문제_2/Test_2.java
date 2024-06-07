package If_문제_모음.If_문제_2;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        //        키보드 입력을 받을 수 있는 변수 생성
        Scanner sc= new Scanner(System.in);
        int a, b, c;
        int max, mid, min;

        System.out.print("첫번째수 :");
        a=sc.nextInt();
        System.out.print("두번째수 :");
        b=sc.nextInt();
        System.out.print("세번째수 :");
        c=sc.nextInt();

        //a가 가장 큰수라면...
        if(a>b&& a>c){
            max=a;
            if(b>c){
                mid=b;
                min=c;

            }
            else {  //b<c
                mid=c;
                min=b;
            }
        }
        //b가 가장 큰수라면...
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
        //c가 가장 큰수라면...
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
