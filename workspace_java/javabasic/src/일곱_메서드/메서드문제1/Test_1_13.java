package 일곱_메서드.메서드문제1;

import java.util.Scanner;

public class Test_1_13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        test(x,y);
    }
    public static void test(int num, int num2){
        System.out.println(num+num2);
    }
}
