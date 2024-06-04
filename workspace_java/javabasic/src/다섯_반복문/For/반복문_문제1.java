package 다섯_반복문.For;

public class 반복문_문제1 {
    public static void main(String[] args) {
        for (int i=1; i<100;i++){
            //  &&  이 아니라 || 를 해줘야함
            if(i%7==0 || i%9==0){
                System.out.println(i);
            }
        }
    }
}
