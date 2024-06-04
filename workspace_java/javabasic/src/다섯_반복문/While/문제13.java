package 다섯_반복문.While;

public class 문제13 {
    public static void main(String[] args) {
        int x=1;
        int y=0;
        while (x <= 100){
            if(x % 5 == 0){ // if 조건이 안맞으면 if안의 내용은 모두 점프 하고 while로 돌아간다
                System.out.println(x);
                y++;
            }
            x++;
        }
        System.out.println("5의 배수의 갯수 :"+y);
    }
}
