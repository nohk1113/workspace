package class_basic;

public class Student {//  이것은 설계도임
    String name;
    int age;
    String adrr;
    String studentNumber;
    String phon;

    // 매개변수로 전달된 문자열로 name 값을 변경하는 메서드
    public void setName(String name1){
        name=name1;
    }
// 나이를 변경하는 메서드
    public void setAge(int a){
        age=a;
    }
    public void setAdrr(String ad){
        adrr=ad;
    }
    public void setStudentNumber(String sn){
        studentNumber=sn;
    }
    public void setPhon(String ph){
        phon=ph;
    }


    public void introduce(){
        System.out.println("이름 :"+name);
        System.out.println("나이 :"+age);
        System.out.println("주소 :"+adrr);
        System.out.println("학번 :"+studentNumber);
        System.out.println("연락처 :"+phon);
    }
}
