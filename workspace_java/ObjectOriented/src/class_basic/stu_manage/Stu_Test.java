package class_basic.stu_manage;

import java.util.Scanner;

public class Stu_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isRunning=true;  // 반복문을 멈추기 위해 세팅한것
        StuManag stuManag=new StuManag();

        System.out.println("학생관리 시스템을 실행합니다 ^^");

        while (isRunning){
            System.out.print("1)학생등록  2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력  5)프로그램 종료 :");
            int menu=sc.nextInt();
            switch (menu){
                case 1: stuManag.regStu();
                    break;
                case 2: stuManag.changeInfo();
                    break;
                case 3: stuManag.print();
                    break;
                case 4: stuManag.printAll();
                    break;
                case 5: System.out.println("프로그램 종료합니다 ^^");
                    isRunning=false;  // 반복이 멈춤
            }
        }

    }
}
