package class_basic.man;

public class Man {
    private String name;
    private int age;
    private String adrr;

    public Man(String name, int age, String adrr){
        this.name=name;
        this.age=age;
        this.adrr=adrr;
    }

    public String getAdrr() {
        return adrr;
    }

    public void setAdrr(String adrr) {
        this.adrr = adrr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void printMan(){
        System.out.println("이름 :"+name);
        System.out.println("나이 :"+age);
        System.out.println("주소 :"+adrr);
    }

    //    // 이름, 나이, 주소 변경하는 메서드 생성
//    public void setName(String name){
//        this.name=name;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//    public void setAdrr(String addr){
//        this.adrr=adrr;
//    }
//
////     리턴 하는 방법
////    setter : 멤버 변수 각각의 값을 변경하는 메서드
////    setter의 이름은 set변수명 으로 반드시 지정!!!
//
////    getter : 멤버변수 각각의 값을 return 받는 메서드
// //   getter
//    public String getname(){
//        return name;
//    }
//    public int getage(){
//        return age;
//    }
//    public String getAdrr(){
//        return adrr;
//    }
//
//    public  void printMan(){
//        System.out.println("이름: "+name);
//        System.out.println("나이: "+age);
//        System.out.println("주소: "+adrr);
//    }

}
