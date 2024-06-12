package 상속;

class A1{
    private int x;
    private int y;
    public A1(){
        x=1;
        y=1;
    }
    public A1(int x){
        this.x=x;
        y=1;
    }
    public A1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void disp(){
        System.out.println("x="+x+" y="+y);
    }
}
class B1 extends A1{
    private int x;
    private int y;
    public B1(){
    }

    public B1(int x){   // 부모 클래스의 x값 변경
        super(x);
        this.x=1;
        y=1;
    }
    public B1(int x, int y){   // 부모 클래스의 x값 변경
        super(x, y);
        this.x=1;
        this.y=1;
    }

    public void disp(){
        super.disp();
        System.out.print("x="+x+" y="+y);
    }
}
public class Work {
    public static void main(String[] args) {
        B1 bp=new B1();
        B1 bp1=new B1(10);
        B1 bp2=new B1(10,20);
//        B1 bp3=new B1(10,20,30);
//        B1 bp4=new B1(10,20,30,40);
        bp.disp();   // x=1y=1x=1y=1
        bp1.disp();  // x=10y=1x=1y=1
        bp2.disp();  // x=10y=20x=1y=1
 //       bp3.disp();  // x=10y=20x=30y=1
 //       bp4.disp();  // x=10y=20x=30y=40

    }
}
