package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
//        정수를 다수 저장할수 있는 리스트 생성
        List<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.get(1);    // 출력
        int a= list.get(1);
    }
}
