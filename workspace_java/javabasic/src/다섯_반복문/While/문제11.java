package 다섯_반복문.While;

public class 문제11 {
    public static void main(String[] args) {
        int x=1;
        int y=0;//3의 배수를 계산해줌
        while (x<=100){
            if (x%3==0){
                y++;
            }
            x++;
        }
        System.out.println(y);
    }
}
