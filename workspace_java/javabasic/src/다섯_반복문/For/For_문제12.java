package 다섯_반복문.For;

public class For_문제12 {
    public static void main(String[] args) {
        int x=0;
        for(int i=1; i<101; i++){
            if(i%3==0){
                x++;
            }
        }
        System.out.println(x);
    }
}
