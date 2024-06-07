package 일곱_메서드;
// 스코프(scope): 영역
//변수의 스코프: 선언한 변수를 사용할수 있는 범위
//변수의 사용 범위: 해당 변수를 선언한 중괄호 안에서만 사용가능!
public class 변수의스코프 {
    public static void main(String[] args) {
        int a;
    }
    public static void m1(){
        int a;
    }
    public  static void  m2(){
        int a;

        for (int i=0; i<10;i++){
        // i는 for문에 선언 되어서 중괄호 안에서만 작용함
        }
        for (int i=0; i<10;i++){

        }

//        if(true){
//            int b=10;
//        }
//        System.out.println(b);
    }
}
