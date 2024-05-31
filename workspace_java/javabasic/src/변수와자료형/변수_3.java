package 변수와자료형;

public class 변수_3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int m3;

        num1=10;
        num2=20;
//두 변수에 저장된 값을 바꾸기 전
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println();

        //이곳에 두변수의 값을 바꾸는 코드를 작성
        m3=num2;
        num2=num1;
        num1=m3;
        //num3변수 선언
        //num2의 값을 num3에 저장  m3=num2인 이유는 2번을 2번에 저장한다는 뜻
        //num1의 값을 num2에 저장  >> 오른쪽에서 왼쪽으로 저장함
        //num3의 값을 num1에 저장


        // 두 변수에 저장된 값을 바꾼후
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);

    }
}
