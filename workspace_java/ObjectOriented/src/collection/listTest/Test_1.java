package collection.listTest;

import java.util.ArrayList;
import java.util.List;

public class Test_1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("aa");
        list.add("ab");
        list.add("ba");

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
