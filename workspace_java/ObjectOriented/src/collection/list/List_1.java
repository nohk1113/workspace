package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {
//        ArrayList 객체 생성
//        배열과 비슷 함, String 데이터를 다수 저장하기 위한 list(통) 셍성
//        기본 자료형은 사용 못함 -> Wrapper 클래스 사용
//        ArrayList<String> list1=new ArrayList<>();  //컬렉션 프레임워크 : 다수의 데이터를 관리하기 위해 자바에서 제공하는 기능 사용
        // 이것이 컬렉션 프레임 워크
        List<String> list1=new ArrayList<>();
//        리스트에 데이터 저장하기    (들어가는 순번이 정해짐)
        list1.add("java");
        list1.add("c++");
        list1.add("python");
        list1.add("c++");

//        리스트에 저장된 데이터 읽기  (순번으로 접근)
       String result= list1.get(1);   // 순번으로 !!!  결과: c++

//        리스트에 저장된 데이터 삭제
        list1.remove(0);  // java   삭제

//        리스트에 저장된 데이터의 갯수
        System.out.println(list1.size());

//        리스트에 저장된 모든 데이터 출력
        for (int i=0; i <list1.size();i++){
            System.out.println(list1.get(i));
        }
    }
}
