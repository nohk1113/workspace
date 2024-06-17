package collection.listTest;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student student1=new Student("이름", 80, 90);
        Student student2=new Student("누누", 90, 80);
        Student student3=new Student("미미", 50, 70);
        list.add(student1);
        list.add(student2);
        list.add(student3);

//        for(int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        for(Student e : list){
            System.out.println(e);
        }

        System.out.println("_________________________________________________");

        int num=0;
        for (int i=0; i<list.size();i++){
            if(list.get(i).getTotal()>=150){
                System.out.println(list.get(i));
            }
        }
        System.out.println("-----------------------------------------------");
// 모든 학생에 대한 총점 에 대한 평균 점수
        int sum=0;
        for (Student e:list){
            sum=sum+e.getTotal();
        }
        System.out.println(sum/(double)list.size());

        System.out.println("---------------------------------------------------------");
        int index = 0;   // 총점이 1등인 학생의 index
        int max = 0;
        for (int i=0; i<list.size();i++){
            if(max <list.get(i).getTotal()){
                max = list.get(i).getTotal();
                index=i;
            }
        }
        System.out.println(list.get(index));
    }
}
