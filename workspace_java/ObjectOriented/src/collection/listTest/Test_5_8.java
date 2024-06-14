package collection.listTest;

import java.util.ArrayList;
import java.util.List;

public class Test_5_8 {
    public static void main(String[] args) {
        List<Test_Member> list = new ArrayList<>();

        Test_Member m1 = new Test_Member("java", "1234", "홍", 20);
        Test_Member m2 = new Test_Member("듀", "5555", "듀나", 23);
        Test_Member m3 = new Test_Member("미미", "8282", "고밍밍", 30);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        for (Test_Member e:list)
            System.out.println(e);
//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
        System.out.println();

        int sum=0;
        for(int i=0; i<list.size(); i++){
           sum=sum+ list.get(i).getAge();
        }
        System.out.println("나이의 합 : "+sum);

        System.out.println();

        int index=0;
        for (int i=0; i<list.size();i++){
            if(list.get(i).getId().equals("java")){
//                하나의 배열 중에 Id가 java와 같다
                index=i;
            }
        }
        list.remove(index);
    }
}
