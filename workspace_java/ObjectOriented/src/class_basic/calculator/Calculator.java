package class_basic.calculator;

import javax.swing.*;

public class Calculator {
//    여기에는 무조건 private를 써야함
    private int num1;
    private int num2;
    private Spring sum1;

//    넘1과 넘2 값을 변경하는 메서드
    public void setNumber(int num1, int num2){
        // this를 붙이는 이유는 이름이 중복되어서 값을 같이 주게 되면 원하는 곳에 넣기위해...
        this.num1=num1;
        this.num2=num2;

    }

    //더하기
    public int getSum(){
        return num1 + num2;
    }
    public int getSub(){
        return num1 - num2;
    }
    public int getMultiply(){
        return num1 * num2;
    }
    public double getDivide(){
        return (double) num1 / num2;
    }
}
