package class_basic.calculator;

import javax.swing.*;

public class Calculator {
    private int num1;
    private int num2;
    private Spring sum1;

//    넘1과 넘2 값을 변경하는 메서드
    public void setNumber(int num1, int num2){
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
