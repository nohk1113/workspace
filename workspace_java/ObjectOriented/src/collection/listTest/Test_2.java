package collection.listTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>list=new ArrayList();

        for (int i=0; i<5; i++){
            System.out.print("정수 5개 입력 : ");
            int a=sc.nextInt();
            list.add(a);
        }
        int sum=0;
        for(int e:list){
            sum=sum+e;
        }
        System.out.println(sum);
    }
}
