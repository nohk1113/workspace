package 상속;

// super : 부모 클래스의 생성자 호출
//this : 현재클래스의 생성자 호출
// super : 부모 클래스에서 선언한 변수
//this : 이 클래스에서 선언한 변수
public class SuperCls {
//    public SuperCls(){}
    public SuperCls(int a){
    }
    public SuperCls(String a, int b){
    }
}

class SubCls extends SuperCls{
    public SubCls(){
        super("aa", 5);  // 이렇게 값을 넣어주면 굳이 부모클래스에 생성자를 안 만들어도됨
        System.out.println("123123");
    }
}
