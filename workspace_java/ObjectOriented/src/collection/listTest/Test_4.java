package collection.listTest;

import java.util.ArrayList;
import java.util.List;

public class Test_4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=0; i<11; i++){
            int rand= (int)(Math.random()*100+1);
            list.add(rand);
        }
//        리스트에 저장된 짝수의 개수 및 모든 짝수 출력
        int cnt=0;
        for(int e:list){
            if (e%2==0){
                cnt++;
            }
        }
        System.out.println("cnt : "+cnt);
    }
}
