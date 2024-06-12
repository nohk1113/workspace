package class_basic.rectangle;

public class Rectangle_1 {
        int x1;
        int x2;
        int y1;
        int y2;

    public Rectangle_1(){}

    public Rectangle_1(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.y1 = x2;
        this.x2 = y1;
        this.y2 = y2;
    }


    public void set(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.y1 = x2;
        this.x2 = y1;
        this.y2 = y2;
    }
    public  int square(){
        return (x2-x1)*(y2-y1);
    }
    // 좌표 출력
    public void show(){
        System.out.println("(" + x1 + ", " + x2 + ")" + ","+ "(" + y1 + ", " + y2 + ")");
        System.out.println("사각형의 넓이: " + square());
    }
    // 인자로 전달된 객체 r과 현 객체가 같은 넓이라면 리턴 true
    public boolean equals(Rectangle_1 r){
        if(r.square()==square()){
            return true;
        }
        else {
            return false;
        }
    }
}
