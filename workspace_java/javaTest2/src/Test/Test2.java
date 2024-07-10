package Test;

import java.util.Arrays;

public class Test2 {
//    . 간단한 로또 번호 생성 프로그램을 만들어보자. 이를 위해 정수 6개를 저장할 수 있는 배열을 만들어, 배열 요소
//    에 1~46 사이의 난수를 저장한다. 단, 중복 값은 허용하며 46은 포함하지 않는다. 배열에 난수를 저장한 후 배
//    열의 모든 요소의 값을 출력하세요.
public static void main(String[] args) {
    //저장할수 있는 정수6개인 배열
    int [] a;
    a= new int[6];
    //1~46 배열 안에 요소 저장(Rand)
    for(int i=0; i<a.length;i++){
        a[i]= (int) (Math.random() * 46) +1;
    }
    System.out.println(Arrays.toString(a));
    //배열요소 출력

    }
}
