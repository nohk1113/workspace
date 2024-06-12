package 상속;

import class_basic.mem.Test;

public class Test_2 {
    public  String nation;

    public Test_2(){
        this("대한민국");
        System.out.println("Parent() call");
    }


public Test_2(String nation){
    this.nation=nation;
    System.out.println("Test_2(String nation call)");
    }
}

class Child extends Test_2{
    private  String name;
    public Child(){
        this("홍길동");   // this.name=name; 해석 >>this.name=홍길동
        System.out.println("Child() call"); // println("Child(String name) call"); 해석
// 전체적으로 this("대한 민국")           >> this.nation=대한민국
//          prtin("Test_2() call")     >> print("Test_2(String nation call)")
    }

    public Child(String name){
        this.name=name;
        System.out.println("Child(String name) call");
    }
}
class ChildExample{
    public static void main(String[] args) {
        Child child=new Child();
    }
}
