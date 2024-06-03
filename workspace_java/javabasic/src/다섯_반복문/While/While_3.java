package 다섯_반복문.While;

public class While_3 {
    public static void main(String[] args) {
//        //10부터 0까지 출력하기
//        int x=10;
//        while (x>=0){
//            System.out.println(x);
//            x--;
//        }

        //1부터 20까지 수 중에서 홀만 출력
        int x= 1;
//        while (x/3==0 && x>=0){
//            System.out.println(x);
//        }
//        while (x<=20){
//            System.out.println(x);
//            x=x+2;
//        }

        //1부터 5까지의 수 중에서 짝수만 출력
        int i= 1;

        while (i<=5){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
