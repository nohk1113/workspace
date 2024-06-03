package 다섯_반복문.While;

public class 문제9 {
    public static void main(String[] args) {
        int x=1;
        int y=0;   // 합을 저장할 변수
        while (x<=10){
            y=y+x;
            ++x;

        }
        System.out.println(y);
    }
}
