package collection.listTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
    private List<Emp> empList;
    private Scanner sc;

    public EmpService(){
        sc=new Scanner(System.in);

        empList = new ArrayList<>();
        Emp emp1=new Emp(1001,"김", "개발부", "1111-2111", 200);
        Emp emp2=new Emp(1002,"박", "개발부", "1111-3111", 300);
        Emp emp3=new Emp(1003,"고", "영업부", "1111-1111", 400);
        Emp emp4=new Emp(1004,"니", "영업부", "1111-5111", 500);
        Emp emp5=new Emp(1005,"미", "인사부", "1111-9111", 600);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
    }
    public void login(){
        boolean isrunning = true;
        boolean isFind=true;
        while (isrunning){
            System.out.print("사번 : ");
            int empNo=sc.nextInt();
            System.out.print("비밀번호 (연락처 마지막 4자리) ; ");
            String pw=sc.next();
//            입력한 사번과 비밀번호가 일치해야함
            for(Emp e:empList){
                if(e.getEmpNo() == empNo && e.getPw().equals(pw)){
                    isrunning=false;   // while  문을 빠져 나오기 위함
                    System.out.println("로그인 하였습니다");
                    System.out.println(e.getName()+"님 반갑습니다*^^*");
                    isFind=true;
                }
            }
            if(!isFind){    // isFind가 사실이 아닐때 실행됨
//                " ! " = 부정 연산자
                System.out.println("사번 , 비번이 일치하지 않습니다!");
            }
        }
    }
//    2번 문제
    public void printDeptMoney(){
        System.out.print("부서명 : ");
        String dept=sc.next();

        int sum=0;
        int cnt=0;  // 찾고자 하는 부서의 인원수
        System.out.println("......."+dept+" 월급 현황.......");
        for (int i=0; i<empList.size();i++){
            if(empList.get(i).getDept().equals(dept)){
                System.out.println(empList.get(i));
                sum=sum+empList.get(i).getMoney();
                cnt++;
            }
        }
        System.out.println(dept + "의 월급 총액은"+sum+", 평균 급여 : "+(sum/(double)cnt));
    }
//    3번 문제
    public void increseMoney(){
        System.out.print("부서명 : ");
        String dept =sc.next();
        System.out.print("인상 급여 : ");
        int money = sc.nextInt();
        System.out.println(dept+"각 사원의 급여가 각각 "+money+"원 씩 인상됩니다.");

//        급여 인상 코드
        for (Emp e:empList){
            if(e.getDept().equals(dept)){
//                int result= 사원의 원래 월급 + 인상급액
                int result= e.getMoney()+money;
                e.setMoney(result);
            }
        }
//        인상 된 사원의 정보 출력
        for (Emp e:empList){
            if (e.getDept().equals(dept)){
                System.out.println(e);
            }
        }
    }
}
