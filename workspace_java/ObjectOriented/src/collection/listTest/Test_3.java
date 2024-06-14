package collection.listTest;

import java.util.ArrayList;
import java.util.List;

public class Test_3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("이름");
        list.add("모모");
        list.add("리리");
        list.add("홍길동");

        for (int i=0; i<list.size(); i++){
            if(list.get(i).equals("홍길동")){
                System.out.println("해당 이름이 존재합니다");
            }
        }
    }
}
