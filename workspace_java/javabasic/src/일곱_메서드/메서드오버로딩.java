package 일곱_메서드;

import javax.swing.plaf.PanelUI;
import javax.swing.plaf.SplitPaneUI;

/*
* overloding
* 메서드 명은 원래 중복 불가.... 하지만 매개변수의 정보가 다르면 중복허용<== 오버로딩
* 매개변수 정보: 매개변수의 자료형, 매개변수의 갯수
* */
public class 메서드오버로딩 {
    public static void main(String[] args) {

        System.out.println();  // println= 메소드
        String s="aa";
        s.equals("jana"); // equals도 메서드

        // 0.0<=x<1.0  실수 리턴하는 메서드
        double ttt= Math.random();

        aaa(10);


        System.out.println("123123");
    }
    public static void  aaa(int a){
        System.out.println(a);  // println()  << 매개 변수임!!!!
    }

    public static void println(){

    }
    public static void println(int a){

    }
    public static void println(String a){

    }
    public static void println(String a, int b){

    }

}
