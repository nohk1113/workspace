package 여섯번째_배열.배열수업내용;

public class 랜덤 {
    public static void main(String[] args) {
        //1~10의 랜덤한 정수

        // 0.0<=x<1.0의 실수  1은 안나옴
//        double rand =Math.random();
        // 0.0 *10 <=x<1.0 * 10 의 실수
        // 결과는 0.0 <=x< 10.0
        // 1.0 <= x <11.0
        int x=(int)(Math.random()*10 + 1);
              //          1~10 랜덤 숫자 임
        System.out.println(x);

//        (int)10.5;   //  강제로 정수 만들기

    }
}
