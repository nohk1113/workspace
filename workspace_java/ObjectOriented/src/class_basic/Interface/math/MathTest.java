package class_basic.Interface.math;

public class MathTest {
    public static void main(String[] args) {
        MyMath mymath=new MyMath();
        System.out.println(mymath.getMultiple(10, 20));
        System.out.println(mymath.getMin(10, 20));
    }
}
