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

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("________________________________________");

        int num=0;
        for (int i=0; i<list.size();i++){
            if(list.get(i).getTotal()>=150){
                num=i;
            }
            System.out.println(list.get(num));

            System.out.println("--------------------------");

        }
        for (int i=0; i<list.size();i++){
            if(list.get(i).getTotal())
        }
    }
}
