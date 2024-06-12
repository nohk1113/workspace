package class_basic.rectangle;

//인자로 전달된 객체r과 현객체가 같은 넓이의 직사각형이면 리턴 true, 같지 않으면 false

public class Rectangle {
    public static void main(String[] args) {

        Rectangle_1 r= new Rectangle_1();

        Rectangle_1 s= new Rectangle_1(1,1,2,3);
        r.show();

        s.show();
        System.out.println(s.square());
        r.set(-2, 2,-1,4);
        r.show();
        System.out.println(r.square());
        if(r.equals(s))
            System.out.println("두 사각형은 같습니다.");
    }
}
