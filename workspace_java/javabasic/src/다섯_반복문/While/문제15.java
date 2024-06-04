package 다섯_반복문.While;

import java.util.Scanner;

public class 문제15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int x=sc.nextInt();
        int y=0;
        int z=1;
        while (z <= x){   // ==  (z < x+1)
            if(z%2==0){
                y++;
            }
            // if가 조건이 성립하지 않으면 안에있는 조건을 무시하고 바로 if바깥의 조건을 수행
            z++;
        }
        System.out.println("1부터"+x+"까지의  짝수의 갯수는"+y );
    }
}
