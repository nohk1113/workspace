package 상속;

// 자바에서 다중 상속은  가능한가? (부모 클래스를 여러개 가질수 있나)
// 문법 적으로는 불가능 >> 논리적으로는 가능 (할머니 a>>부모 a, b>>자식 a, b, c)
// 자식은 여럿인것이 가능함
public class Grande {
    int a;
}

class Parent1 extends Grande{
    int b;
}
// grande가 부모인 자식 클래스임.
class Child1 extends Parent1 {
    int c;

    public void aaa(){
        System.out.println(a);
        System.out.println(b);
    }
}
