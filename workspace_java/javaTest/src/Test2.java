import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test2 {
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
