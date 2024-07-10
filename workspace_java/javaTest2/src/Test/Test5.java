package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {


//    먼저 크기가 3인 정수형 배열을 생성하고 배열의 각 요소에 1 ~ 9사이의 랜덤한 정수를 저장한다. 중복 불허.
        int[] arr;
        arr = new int[3];
        int inputarr[]=new int[3];
        int strike = 0;
        int ball=0;

        for (int i=0; i<arr.length; i++){
//            겹치는 숫자가 없도록
            arr[i]=(int)(Math.random()*9+1);
            for(int j=0; j<i; j++){
                if(arr[j]==arr[i]){
                    i--;
                    break;
                }
            }
        }
        for (int x:arr){
            System.out.print(x);
        }
        System.out.println("");
        //    Scanner를 통해 입력한 세 수와 요구사항 1)에서 생성한 랜덤한 세 수를 비교하여 스트라이크와 볼을 결정한다.
        Scanner s=new Scanner(System.in);
        while(true) {
            for(int i  = 0; i < inputarr.length; i++) {
                System.out.print("1~9사이의 정수를 입력하세요 : ");
                inputarr[i] = s.nextInt();
                for(int j = 0; j < i; j++) {
                    if(inputarr[j] == inputarr[i]) {
                        System.out.print("중복된 값을 입력했습니다.");
                        i--;
                        break;
                    }
                }
            }
            //입력한 숫자와 정답숫자를 비교하여 Strike인지 Ball인지 구분
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < inputarr.length; j++) {

                    if(arr[i] == inputarr[j] && i == j) {

                        strike++;
                    }else if(arr[i] == inputarr[j] && i != j) {
                        //같은 숫자만 있으면 볼
                        ball++;
                    }
                }
            }
            System.out.println(strike + "스트라이크" + ball + "볼");
            if(strike == 3) {
                System.out.println("정답을 맞추었습니다");
                break;
            }
            strike = 0;
            ball = 0;
        }
    }
}
