package class_basic.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        // 키보드 입력
        Scanner sc= new Scanner(System.in);
        System.out.print("첫번쨰 수 :");
        int num1=sc.nextInt();
        System.out.print("연산자 :");
        String sum1=sc.next();
        System.out.print("두번째 수 :");
        int num2=sc.nextInt();

//       calculator의 객체에 키보드로 입력받은 값으로 변경해줌
        calculator.setNumber(num1, num2);

//  글자는 .equals를 사용
        if(sum1.equals("+")){
            System.out.println(num1+"+"+num2+"="+ calculator.getSum());
        }
        else if(sum1.equals("-")){
            System.out.println(num1+"-"+num2+"="+ calculator.getSub());
        }
        else if(sum1.equals("*")){
            System.out.println(num1+"*"+num2+"="+ calculator.getMultiply());
        }
        else if(sum1.equals("/")){
            System.out.println(num1+"/"+num2+"="+ calculator.getDivide());
        }
        else {
            System.out.println("연산자를 잘못입력했어요");
        }
    }
}
