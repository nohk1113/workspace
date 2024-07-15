package test;


import java.security.AllPermission;
import java.sql.SQLOutput;

public class MathUtilTest implements MathUtil {

    //매개변수로 받은 세 수의 합이 짝수이면서
    //동시에 5의 배수일 경우에만 리턴 true
    @Override
    public boolean isEven(int a, int b, int c) {
//        return (a+b+c)%2==0 && (a+b+c)%5==0;
        int sum=a+b+c;
//        길게 풀어서 코딩한 것 (정답)
//        if(sum%5==0 && sum%2==0){
//            return true;
//        }
//        else {
//            return false;
//        }

        return sum%5==0 && sum%2==0;
    }

    //1부터 매개변수로 받은 수까지의 합을 리턴
    @Override
    public int getSumFromOne(int num) {
        int sum=0;
        for (int i=0; i<=num; i++){
            sum+=i;

        }
        return sum;

//        int add=1;
//        for (int i=0; i<num; i++){
//            add=add+num;
//        }
//        return add;
    }

    //매개변수로 정수형 배열이 들어오면
    //해당 배열의 모든 요소의 합을 리턴
    @Override
    public int getArraySum(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;

//        int arrPl=0;
//        for(int i=0; i<arr.length;i++){
//            arrPl+=arr[i];
//        }
//        return arrPl;
    }


}
