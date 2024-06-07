package 일곱_메서드.메서드_심화_문제;

public class Test_3 {
    public static void main(String[] args) {
        test(10);
    }

    //1 ~ 100      a = 5
    public static void test(int a){
       for(int i = 1 ; i < 101 ; i++){
           if(i % a == 0){
               System.out.println(i);
           }
       }
    }

}
