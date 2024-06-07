package 일곱_메서드.메서드문제1;

import java.util.Scanner;

public class Test_1_9_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("입력 : ");
        String name=sc.next();
        int age=sc.nextInt();
        String adrr=sc.next();

        t9("고먐미");
        t9_2(10);
        t9_3("캣 타워");
        t10(name, age, adrr);
    }
    public static void t9(String name){
        System.out.println(name);
    }
    public static void t9_2(int age){
        System.out.println(age);
    }
    public static void t9_3(String addr){
        System.out.println(addr);
    }
    // 10번 문제
    public static void t10(String name, int age, String addr){
        t9(name);
        t9_2(age);
        t9_3(addr);
    }

}
