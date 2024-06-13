package class_basic.Interface;

public class LgTv implements Tv{
    public void turnOn(){
        System.out.println("엘지티비 - 켬");
    }
    public void turnOff(){
        System.out.println("엘지티비 - 끔");
    }
    public void volumeDown(){
        System.out.println("엘지티비 - 소리줄임");
    }
    public void volumeUp(){
        System.out.println("엘지티비 - 소리올림");
    }

}
