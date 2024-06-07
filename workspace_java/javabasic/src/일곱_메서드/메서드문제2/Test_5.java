package 일곱_메서드.메서드문제2;

import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {
        System.out.println(t5(81));
    }
    public static String t5(int a){
        if(a>89){
            return "A";
        }
        else if(a>69){
            return "B";
        }
        else {
            return "C";
        }
    }
}
