package class_basic.Interface.math;

public class MyMath implements MathUtil{
    @Override
    public int getMin(int aq, int b) {
        return aq<b?aq:b;
//        if (aq>b){
//            return b;
//        }
//        else {
//            return aq;
//        }
    }

    @Override
    public double getCircleArea(int radius) {
        return radius>0?0:2*3.14*radius;
//        if(radius>0){
//            return 2*Math.PI*radius;
//        }
//        else {
//            return 0;
//        }
    }

    @Override
    public int getMultiple(int num1, int n) {
        int result=1; // 곱하는거니까 1부터
        for(int i=0; i<n;i++){
            result=result*num1;
        }
        return result;
    }
}
