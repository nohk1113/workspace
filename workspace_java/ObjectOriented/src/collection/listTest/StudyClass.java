package collection.listTest;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
    private String className;
    private String teacher;
    private List <Student_3> stuList;

    public List<Student_3> getStuList(){
        return stuList;
    }

        public void printStuAll(){
            for (Student_3 e:stuList){
                System.out.println(e);
            }
        }
    public StudyClass(String className,String teacher, List<Student_3> stuList) {
        this.className = className;
        this.teacher = teacher;
        this.stuList = stuList;
    }

}
