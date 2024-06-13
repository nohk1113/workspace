package class_basic.Interface;

public class Tvuser {
    public static void main(String[] args) {

//        인터페이스를 구현한 ...
        Tv tv1=new SamsungTv();
        Tv tv=new LgTv();


        tv.turnOn();
        tv.volumeDown();
        tv.volumeUp();
        tv.turnOff();
    }
}
