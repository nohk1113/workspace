package test;

public class Calculate {
    private int num1;
    private int num2;
    void setNumber(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        }

    int getSum(){
        return num1+num2;
    }

    int getMax(){
        return (num1>num2)  ? num1:num2;
    }

    double getpl(){
        int answer=0;
        int max=Math.max(num1, num2);
        int min=Math.min(num1, num2);
        for (int i=min; i<max;i++){
            answer+=i;
        }
        return answer;
    }
}
