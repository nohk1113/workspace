import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_1 {
    public static void main(String[] args) {

//        데이터 중복가능, 데이터에 순번이 존재함
        List<String> list = new ArrayList<>();
//        데이터가  key와 value한 쌍으로 저장 됨
        Map<Integer, String> map = new HashMap<>();

//        map에 데이터 저장
        map.put(1, "java");
        map.put(2, "python");
        map.put(3, "c++");

//        map에 저장 된 데이터 읽기  (key값을 읽음)
        System.out.println(map.get(1));

//        const map = {
//          1:"java",
//        2:"python",
//        3:"c++"
//        };
    }
}
