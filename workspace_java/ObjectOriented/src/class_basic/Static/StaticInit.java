package class_basic.Static;

public class StaticInit {
//    static 키워드가
//    static 키워드가 붙은 멤버 변수는 생성자에서 초기화 x
    int a;
    static int num;
//    static 변수의 초기화
    static {
        num=5;
}

    public StaticInit(){
        a=10;
//        num=5;      생성자에게 static 초기화 하지마세요!!!
        num++;
        System.out.println("a : "+a);
        System.out.println("num : "+num);
    }
}
