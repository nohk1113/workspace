package class_basic.stu_manage;

import java.util.Scanner;

public class Stu {
   private String name;
   private int age;
   private String grade;
   private String tel;

//    생성자
    public Stu(String name, int age, String grade, String tel) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.tel = tel;
    }
//    학생의 모든정보를 모두 출력
    public void showInfo(){
        System.out.println("이름 :"+name);
        System.out.println("나이 :"+age);
        System.out.println("학점 :"+grade);
        System.out.println("연락처 :"+tel);
    }
}
