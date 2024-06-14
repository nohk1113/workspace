package class_basic.Interface.student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StudenTest s=new StudenTest();
        Student[] Student = new Student[5];
        Student s1= new Student("kim", 90,90,90);
        Student s2= new Student("lim", 90,40,50);
        Student s3= new Student("min", 80,50,70);
        Student s4= new Student("mama", 50,20,80);
        Student s5= new Student("papa", 10,90,90);
        Student[0]=s1;
        Student[1]=s2;
        Student[2]=s3;
        Student[3]=s4;
        Student[4]=s5;
        String result1= s.getGradeByStudentName(Student, "kim");
        System.out.println(result1);

        System.out.println();

        int[] result2= s.getTotalScoresToArray(Student);
        System.out.println(Arrays.toString(result2));

        System.out.println();

        Student stu= s.getHighScoreStudent(s1, s2);   // 리턴타입 마우스 올리면 볼수 있음
//        리턴 타입
        System.out.println(stu.getName());
    }
}
